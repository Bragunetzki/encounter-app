package bragunetzki.encounter_app.services;

import bragunetzki.encounter_app.dto.EncounterTableEntryDTO;
import bragunetzki.encounter_app.models.Encounter;
import bragunetzki.encounter_app.repositories.EncounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EncounterService {
    private final EncounterRepository encounterRepository;

    @Autowired
    public EncounterService(EncounterRepository encounterRepository) {
        this.encounterRepository = encounterRepository;
    }

    public List<Encounter> getEncounters() {
        return encounterRepository.findAll();
    }

    public List<EncounterTableEntryDTO> generateEncounterTable(int baseLevel, String climateZone, String biome, String hostility) {
        List<Encounter> encounters = encounterRepository.findFilteredEncounters(baseLevel - 3, baseLevel + 2, climateZone, hostility, biome);

        return encounters.stream()
                .map(encounter -> new EncounterTableEntryDTO(
                        calculateWeight(encounter),
                        encounter.getName(),
                        calculateCount(encounter, baseLevel)
                ))
                .collect(Collectors.toList());
    }

    private int calculateWeight(Encounter encounter) {
        String rarity =encounter.getRarity();
        return switch (rarity) {
            case "Common" -> 10;
            case "Uncommon" -> 5;
            case "Rare" -> 3;
            default -> 1;
        };
    }

    private String calculateCount(Encounter encounter, int baseLevel) {
        int levelDiff = encounter.getMinLevel() - baseLevel;

        if (levelDiff <= -4) {
            return "2d6";
        }
        if (levelDiff == -3)
            return "2d4";
        if (levelDiff == -2)
            return "2d3";
        if (levelDiff == -1)
            return "1d4";
        if (levelDiff == 0)
            return "1d3";
        if (levelDiff == 1)
            return "1d2";
        return "1";
    }
}

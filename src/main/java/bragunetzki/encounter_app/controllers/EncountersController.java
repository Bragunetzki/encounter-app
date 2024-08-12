package bragunetzki.encounter_app.controllers;

import bragunetzki.encounter_app.dto.EncounterTableEntryDTO;
import bragunetzki.encounter_app.models.Encounter;
import bragunetzki.encounter_app.services.EncounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/encounters")
public class EncountersController {
    private final EncounterService encounterService;

    @Autowired
    public EncountersController(EncounterService encounterService) {
        this.encounterService = encounterService;
    }

    @GetMapping()
    public List<Encounter> getEncounters() {
        return encounterService.getEncounters();
    }

    @GetMapping("/table")
    public List<EncounterTableEntryDTO> getEncounterTable(
            @RequestParam int level,
            @RequestParam String climateZone,
            @RequestParam String biome,
            @RequestParam String hostility) {
        return encounterService.generateEncounterTable(level, climateZone, biome, hostility);
    }
}

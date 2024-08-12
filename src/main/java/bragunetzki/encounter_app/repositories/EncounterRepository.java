package bragunetzki.encounter_app.repositories;

import bragunetzki.encounter_app.models.Encounter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EncounterRepository extends JpaRepository<Encounter, Integer> {
    @Query("SELECT e " +
            "FROM Encounter e " +
            "JOIN encountergroup g ON e.parentGroupId = g.encounterGroupId " +
            "JOIN encounterbiome eb ON e.encounterId = eb.encounterId " +
            "JOIN Biome b ON eb.biomeId = b.biomeId " +
            "JOIN encounterclimate ec ON e.encounterId = ec.encounterId " +
            "JOIN Climate c ON ec.climateId = c.climateId " +
            "JOIN encountertype et ON et.encounterTypeId = e.encounterTypeId " +
            "WHERE e.minLevel >= :minLevel AND e.minLevel <= :maxLevel " +
            "AND c.name = :climateZone " +
            "AND b.name = :biome " +
            "AND et.name = :hostility")
    List<Encounter> findFilteredEncounters(
            @Param("minLevel") int minLevel,
            @Param("maxLevel") int maxLevel,
            @Param("climateZone") String climateZone,
            @Param("hostility") String hostility,
            @Param("biome") String biome);
}

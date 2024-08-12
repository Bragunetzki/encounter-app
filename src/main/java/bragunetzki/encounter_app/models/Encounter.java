package bragunetzki.encounter_app.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Encounter {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long encounterId;

    @NotEmpty(message = "Name cannot be empty.")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters.")
    private String name;
    @Min(value = -1, message = "Min level should be equal to or greater than -1.")
    private int minLevel;
    @Min(value = -1, message = "Max level should be equal to or greater than -1.")
    private int maxLevel;
    private String rarity;
    private int encounterTypeId;
    private Integer parentGroupId;
    private String description;

    public Encounter() {

    }

    public Encounter(Long encounterId, String name, int minLevel, int maxLevel,
                     String rarity, int encounterTypeId,
                     int parentGroupId, String description) {
        this.encounterId = encounterId;
        this.name = name;
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
        this.rarity = rarity;
        this.encounterTypeId = encounterTypeId;
        this.parentGroupId = parentGroupId;
        this.description = description;
    }

    public void setEncounterId(Long encounterId) {
        this.encounterId = encounterId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMinLevel(int minLevel) {
        this.minLevel = minLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void setEncounterTypeId(int encounterTypeId) {
        this.encounterTypeId = encounterTypeId;
    }

    public void setParentGroupId(Integer parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getEncounterId() {
        return encounterId;
    }

    public String getName() {
        return name;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public String getRarity() {
        return rarity;
    }

    public int getEncounterTypeId() {
        return encounterTypeId;
    }

    public Integer getParentGroupId() {
        return parentGroupId;
    }

    public String getDescription() {
        return description;
    }
}


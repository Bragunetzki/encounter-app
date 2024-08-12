package bragunetzki.encounter_app.dto;

public class EncounterTableEntryDTO {
    private int weight;
    private String encounterName;
    private String count;

    public EncounterTableEntryDTO(int weight, String encounterName, String count) {
        this.weight = weight;
        this.encounterName = encounterName;
        this.count = count;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEncounterName() {
        return encounterName;
    }

    public void setEncounterName(String encounterName) {
        this.encounterName = encounterName;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}

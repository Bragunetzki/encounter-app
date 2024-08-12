package bragunetzki.encounter_app.models;


import jakarta.persistence.*;

@Entity(name = "encountertype")
public class EncounterType {
    @Id
    @SequenceGenerator(name = "encountertype_encounter_type_id_seq", sequenceName = "encountertype_encounter_type_id_seq", allocationSize = 1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "encountertype_encounter_type_id_seq")
    private int encounterTypeId;
    private String name;

    public EncounterType() {

    }

    public EncounterType(int encounterTypeId, String name) {
        this.encounterTypeId = encounterTypeId;
        this.name = name;
    }

    public int getEncounterTypeId() {
        return encounterTypeId;
    }

    public String getName() {
        return name;
    }

    public void setEncounterTypeId(int encounterTypeId) {
        this.encounterTypeId = encounterTypeId;
    }

    public void setName(String name) {
        this.name = name;
    }
}

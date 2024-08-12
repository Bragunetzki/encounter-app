package bragunetzki.encounter_app.models;

import jakarta.persistence.*;

@Entity(name="encountergroup")
public class EncounterGroup {
    @Id
    @SequenceGenerator(name = "encountergroup_encounter_group_id_seq", sequenceName = "encountergroup_encounter_group_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "encountergroup_encounter_group_id_seq")
    private Integer encounterGroupId;
    private String name;
    private Integer parentGroupId;

    public EncounterGroup(int encounterGroupId, String name, int parentGroupId) {
        this.encounterGroupId = encounterGroupId;
        this.name = name;
        this.parentGroupId = parentGroupId;
    }

    public EncounterGroup() {

    }

    public void setEncounterGroupId(int encounterGroupId) {
        this.encounterGroupId = encounterGroupId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentGroupId(int parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    public Integer getEncounterGroupId() {
        return encounterGroupId;
    }

    public String getName() {
        return name;
    }

    public Integer getParentGroupId() {
        return parentGroupId;
    }
}

package bragunetzki.encounter_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity(name="encounterclimate")
@IdClass(EncounterClimateId.class)
public class EncounterClimate {
    @Id
    private Long encounterId;
    @Id
    private int climateId;

    public EncounterClimate() {

    }

    public EncounterClimate(long encounterId, int climateId) {
        this.encounterId = encounterId;
        this.climateId = climateId;
    }

    public Long getEncounterId() {
        return encounterId;
    }

    public int getClimateId() {
        return climateId;
    }

    public void setEncounterId(long encounterId) {
        this.encounterId = encounterId;
    }

    public void setClimateId(int climateId) {
        this.climateId = climateId;
    }
}

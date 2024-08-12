package bragunetzki.encounter_app.models;

import java.io.Serializable;
import java.util.Objects;

public class EncounterClimateId implements Serializable {
    private Long encounterId;
    private int climateId;

    public EncounterClimateId() {

    }

    public EncounterClimateId(long encounterId, int climateId) {
        this.encounterId = encounterId;
        this.climateId = climateId;
    }

    public void setEncounterId(long encounterId) {
        this.encounterId = encounterId;
    }

    public void setClimateId(int climateId) {
        this.climateId = climateId;
    }

    public Long getEncounterId() {
        return encounterId;
    }

    public int getClimateId() {
        return climateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EncounterClimateId that = (EncounterClimateId) o;
        return encounterId == that.encounterId && climateId == that.climateId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(encounterId, climateId);
    }
}

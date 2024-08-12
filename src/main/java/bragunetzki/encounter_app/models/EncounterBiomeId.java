package bragunetzki.encounter_app.models;

import java.io.Serializable;
import java.util.Objects;

public class EncounterBiomeId implements Serializable {
    private Long encounterId;
    private int biomeId;

    public EncounterBiomeId() {

    }

    public EncounterBiomeId(long encounterId, int biomeId) {
        this.encounterId = encounterId;
        this.biomeId = biomeId;
    }

    public void setEncounterId(long encounterId) {
        this.encounterId = encounterId;
    }

    public void setBiomeId(int biomeId) {
        this.biomeId = biomeId;
    }

    public Long getEncounterId() {
        return encounterId;
    }

    public int getBiomeId() {
        return biomeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EncounterBiomeId that = (EncounterBiomeId) o;
        return encounterId == that.encounterId && biomeId == that.biomeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(encounterId, biomeId);
    }
}

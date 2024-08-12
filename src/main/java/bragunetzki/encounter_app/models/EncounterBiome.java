package bragunetzki.encounter_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity(name="encounterbiome")
@IdClass(EncounterBiomeId.class)
public class EncounterBiome {
    @Id
    private Long encounterId;
    @Id
    private int biomeId;

    public EncounterBiome() {

    }

    public EncounterBiome(long encounterId, int biomeId) {
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
}

package bragunetzki.encounter_app.models;

import jakarta.persistence.*;

@Entity
public class Biome {
    @Id
    @SequenceGenerator(name = "biome_biome_id_seq", sequenceName = "biome_biome_id_seq", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="biome_biome_id_seq")
    private Integer biomeId;
    private String name;

    public Biome() {

    }

    public Biome(Integer biomeId, String name) {
        this.biomeId = biomeId;
        this.name = name;
    }

    public Integer getBiomeId() {
        return biomeId;
    }

    public String getName() {
        return name;
    }

    public void setBiomeId(Integer biomeId) {
        this.biomeId = biomeId;
    }

    public void setName(String name) {
        this.name = name;
    }
}

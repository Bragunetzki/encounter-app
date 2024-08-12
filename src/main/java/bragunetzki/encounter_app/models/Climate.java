package bragunetzki.encounter_app.models;

import jakarta.persistence.*;

@Entity
public class Climate {
    @Id
    @SequenceGenerator(name = "climate_climate_id_seq", sequenceName = "climate_climate_id_seq", allocationSize = 1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "climate_climate_id_seq")
    private int climateId;
    private String name;

    public Climate() {

    }

    public Climate(int climateId, String name) {
        this.climateId = climateId;
        this.name = name;
    }

    public int getClimateId() {
        return climateId;
    }

    public String getName() {
        return name;
    }

    public void setClimateId(int climateId) {
        this.climateId = climateId;
    }

    public void setName(String name) {
        this.name = name;
    }
}

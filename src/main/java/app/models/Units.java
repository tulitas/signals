package app.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "units")
public class Units implements Serializable {
    @Id
    @Column(name = "unit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long unit_id;

    @Column(name = "unit_name")
    private String unit_name;

    @Column(name = "precision")
    private Integer precision;

    public long getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(long unit_id) {
        this.unit_id = unit_id;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    @Override
    public String toString() {
        return "Units{" +
                "unit_id=" + unit_id +
                ", unit_name='" + unit_name + '\'' +
                ", precision=" + precision +
                '}';
    }
}

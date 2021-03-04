package app.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "metrics")
public class Metrics implements Serializable {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer metric_id;

    @Column(name = "metric_name")
    private String metric_name;

    @Column(name = "unit_id")
    private Integer unit_id;

    @OneToMany(targetEntity = Measures.class,
            mappedBy = "metric_id",
            orphanRemoval = false,
            fetch = FetchType.EAGER)

    private Set<Measures> measures;

    public Set<Measures> getMeasures() {
        return measures;
    }

    public void setMeasures(Set<Measures> measures) {
        this.measures = measures;
    }

    public long getMetric_id() {
        return metric_id;
    }

    public void setMetric_id(Integer metric_id) {
        this.metric_id = metric_id;
    }

    public String getMetric_name() {
        return metric_name;
    }

    public void setMetric_name(String metric_name) {
        this.metric_name = metric_name;
    }

    public Integer getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(Integer unit_id) {
        this.unit_id = unit_id;
    }

    @Override
    public String toString() {
        return "Metrics{" +
                "metric_id=" + metric_id +
                ", metric_name='" + metric_name + '\'' +
                ", unit_id=" + unit_id +
                '}';
    }
}

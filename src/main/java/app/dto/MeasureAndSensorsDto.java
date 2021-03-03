package app.dto;

public class MeasureAndSensorsDto {

    private Long reading_id;
    private Integer sensor_id;
    private Integer metric_id;
    private String rtime;
    private Double rvalue;
    private String name;

    public MeasureAndSensorsDto(Long reading_id, Integer sensor_id,
                                Integer metric_id, String rtime, Double rvalue, String name ){
        this.reading_id = reading_id;
        this.sensor_id = sensor_id;
        this.metric_id = metric_id;
        this.rtime = rtime;
        this.rvalue = rvalue;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getReading_id() {
        return reading_id;
    }

    public void setReading_id(Long reading_id) {
        this.reading_id = reading_id;
    }

    public Integer getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(Integer sensor_id) {
        this.sensor_id = sensor_id;
    }

    public Integer getMetric_id() {
        return metric_id;
    }

    public void setMetric_id(Integer metric_id) {
        this.metric_id = metric_id;
    }

    public String getRtime() {
        return rtime;
    }

    public void setRtime(String rtime) {
        this.rtime = rtime;
    }

    public Double getRvalue() {
        return rvalue;
    }

    public void setRvalue(Double rvalue) {
        this.rvalue = rvalue;
    }

    @Override
    public String toString() {
        return "MeasureAndSensorsDto{" +
                "reading_id=" + reading_id +
                ", sensor_id=" + sensor_id +
                ", metric_id=" + metric_id +
                ", rtime='" + rtime + '\'' +
                ", rvalue=" + rvalue +
                ", name='" + name + '\'' +
                '}';
    }
}

package app.dto;

public class MeasureAndSensorsDto {

    private Long reading_id;
    private Integer sensor_id;
    private String metric_id;
    private double rtime;
    private String rvalue;

    public MeasureAndSensorsDto(Long reading_id, Integer sensor_id, String metric_id, double rtime, String rvalue ){
        this.reading_id = reading_id;
        this.sensor_id = sensor_id;
        this.metric_id = metric_id;
        this.rtime = rtime;
        this.rvalue = rvalue;
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

    public String getMetric_id() {
        return metric_id;
    }

    public void setMetric_id(String metric_id) {
        this.metric_id = metric_id;
    }

    public double getRtime() {
        return rtime;
    }

    public void setRtime(double rtime) {
        this.rtime = rtime;
    }

    public String getRvalue() {
        return rvalue;
    }

    public void setRvalue(String rvalue) {
        this.rvalue = rvalue;
    }

    @Override
    public String toString() {
        return "MeasureAndSensorsDto{" +
                "reading_id=" + reading_id +
                ", sensor_id=" + sensor_id +
                ", metric_id=" + metric_id +
                ", rtime='" + rtime + '\'' +
                ", rvalue='" + rvalue + '\'' +
                '}';
    }
}

package app.dto;

public class MeasureAndSensorsDto {

    private String readingId;
    private String sensorId;
    private String metricId;
    private String rtime;
    private String rvalue;

    public MeasureAndSensorsDto(String readingId, String sensorId, String metricId, String rtime, String rvalue ){
        this.readingId = readingId;
        this.sensorId = sensorId;
        this.metricId = metricId;
        this.rtime = rtime;
        this.rvalue = rvalue;
        System.out.println("!!!!!!!!!!");
    }

    public String getReadingId() {
        return readingId;
    }

    public void setReadingId(String readingId) {
        this.readingId = readingId;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getMetricId() {
        return metricId;
    }

    public void setMetricId(String metricId) {
        this.metricId = metricId;
    }

    public String getRtime() {
        return rtime;
    }

    public void setRtime(String rtime) {
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
                "readingId='" + readingId + '\'' +
                ", sensorId='" + sensorId + '\'' +
                ", metricId='" + metricId + '\'' +
                ", rtime='" + rtime + '\'' +
                ", rvalue='" + rvalue + '\'' +
                '}';
    }
}

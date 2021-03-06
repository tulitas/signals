package app.services;

import app.dto.MeasureAndMetricsDto;
import app.repositories.MetricsRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JoinMeasureAndMetric {

    @Resource
    private MetricsRepository metricsRepository;

    public List<MeasureAndMetricsDto> getMeasureAndMetricsLeftJoin() {
        List<MeasureAndMetricsDto> list = metricsRepository.fetchEmpPosDataRightJoin();
        return list;
    }

    public List<MeasureAndMetricsDto> getMeasureAndMetricsLeftJoinByDate(String metricData) {
        List<MeasureAndMetricsDto> list = metricsRepository.fetchEmpPosDataRightJoinByDate(metricData);
        return list;
    }

    public Object getMeasureAndMetricsLeftJoinByParameter(Integer parameter1, Integer parameter2, String metricData) {
        List<MeasureAndMetricsDto> list = metricsRepository.fetchEmpPosDataRightJoinByParameter(parameter1, parameter2, metricData);
        return list;
    }
}

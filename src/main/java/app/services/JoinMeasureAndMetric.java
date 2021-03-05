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
//        list.forEach(System.out::println);
        return list;
    }


}

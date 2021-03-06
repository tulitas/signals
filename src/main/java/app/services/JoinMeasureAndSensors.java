package app.services;

import app.dto.MeasureAndSensorsDto;
import app.repositories.SensorsRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class JoinMeasureAndSensors {

    @Resource
    private SensorsRepository sensorsRepository;

    public List<MeasureAndSensorsDto> getMeasureAndSensorsRightJoin() {
        List<MeasureAndSensorsDto> list = sensorsRepository.fetchEmpPosDataRightJoin();
        return list;
    }

    public List<MeasureAndSensorsDto> getMeasureAndSensorsRightJoinByDate(String metricData) {
        List<MeasureAndSensorsDto> list = sensorsRepository.fetchEmpPosDataRightJoinByDate(metricData);
        return list;
    }

    public Object getMeasureAndSensorsRightJoinByParameter(Integer parameter1, Integer parameter2, String metricData) {
        List<MeasureAndSensorsDto> list = sensorsRepository.fetchEmpPosDataRightJoinByParameter(parameter1, parameter2, metricData);
        return list;
    }
}

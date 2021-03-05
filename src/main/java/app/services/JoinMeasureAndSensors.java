package app.services;

import app.dto.MeasureAndSensorsDto;
import app.models.Sensors;
import app.repositories.MeasuresRepository;
import app.repositories.SensorsRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
@Service
public class JoinMeasureAndSensors {

    @Resource
    private SensorsRepository sensorsRepository;

    public List<MeasureAndSensorsDto> getMeasureAndSensorsRightJoin() {
        List<MeasureAndSensorsDto> list = sensorsRepository.fetchEmpPosDataRightJoin();
        list.forEach(System.out::println);
        return list;
    }
}

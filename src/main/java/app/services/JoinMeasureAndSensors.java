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
    private MeasuresRepository measuresRepository;
    @Resource
    private SensorsRepository sensorsRepository;


    public List<MeasureAndSensorsDto> getMeasureAndSensorsRightJoin() {
        System.out.println("987987987987987987");
        List<MeasureAndSensorsDto> list = sensorsRepository.fetchEmpPosDataRightJoin();
        System.out.println("@@@@@@@@@@@@");
        list.forEach(l -> System.out.println(l));
        return list;
    }
}

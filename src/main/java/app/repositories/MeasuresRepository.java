package app.repositories;

import app.dto.MeasureAndSensorsDto;
import app.models.Measures;
import app.models.Sensors;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeasuresRepository extends CrudRepository<Sensors, Integer> {
    @Query(value = "SELECT new app.dto.MeasureAndSensorsDto(d.sensor_id, e.reading_id, e.metricId, e.rtime, e.rvalue) " +
            "FROM Sensors d LEFT JOIN d.measures e")
    List<MeasureAndSensorsDto> fetchEmpPosDataRightJoin();
}

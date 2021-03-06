package app.repositories;

import app.dto.MeasureAndSensorsDto;
import app.models.Sensors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Repository
public interface SensorsRepository extends JpaRepository<Sensors, Integer>, CrudRepository<Sensors, Integer> {
    @Query(value = "SELECT new app.dto.MeasureAndSensorsDto( e.reading_id, e.sensor_id,  e.metric_id, e.rtime, e.rvalue, d.name) " +
            "FROM Sensors d left JOIN d.measures e ")
    List<MeasureAndSensorsDto> fetchEmpPosDataRightJoin();

    @Query(value = "SELECT new app.dto.MeasureAndSensorsDto( e.reading_id, e.sensor_id,  e.metric_id, e.rtime, e.rvalue, d.name) " +
            "FROM Sensors d left JOIN d.measures e where rtime like %:metricData%")
    List<MeasureAndSensorsDto> fetchEmpPosDataRightJoinByDate(String metricData);

    @Query(value = "SELECT  new app.dto.MeasureAndSensorsDto( e.reading_id, e.sensor_id,  e.metric_id, e.rtime, min(e.rvalue), d.name)" +
            "FROM Sensors d left JOIN d.measures  e  where rtime like %:metricData% and e.metric_id = :parameter1 and e.sensor_id = :parameter2")
    List<MeasureAndSensorsDto> fetchEmpPosDataRightJoinByParameterMin(Integer parameter1, Integer parameter2, String metricData);

    @Query(value = "SELECT  new app.dto.MeasureAndSensorsDto( e.reading_id, e.sensor_id,  e.metric_id, e.rtime, max(e.rvalue), d.name)" +
            "FROM Sensors d left JOIN d.measures  e  where rtime like %:metricData% and e.metric_id = :parameter1 and e.sensor_id = :parameter2")
    List<MeasureAndSensorsDto> fetchEmpPosDataRightJoinByParameterMax(Integer parameter1, Integer parameter2, String metricData);

}

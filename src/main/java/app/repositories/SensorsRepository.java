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
    @Query(value = "SELECT new app.dto.MeasureAndSensorsDto( e.reading_id, e.sensor_id,  e.metric_id, e.rtime, e.rvalue, d.name, c.metric_name) " +
            "FROM Sensors d, Metrics c left JOIN d.measures e where rtime = '2019-08-21 00:26:38'")
    List<MeasureAndSensorsDto> fetchEmpPosDataRightJoin();

    @Query(value = "SELECT new app.dto.MeasureAndSensorsDto( e.reading_id, e.sensor_id,  e.metric_id, e.rtime, e.rvalue, d.name, c.metric_name) " +
            "FROM Sensors d, Metrics c left JOIN d.measures e where rtime like %:metricDate%")
    List<MeasureAndSensorsDto> fetchEmpPosDataRightJoinDate(String metricDate);

}

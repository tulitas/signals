package app.repositories;

import app.dto.MeasureAndMetricsDto;
import app.dto.MeasureAndSensorsDto;
import app.models.Metrics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MetricsRepository extends CrudRepository<Metrics, Integer>, JpaRepository<Metrics, Integer> {
    @Query(value = "SELECT new app.dto.MeasureAndMetricsDto(e.reading_id, e.sensor_id,  e.metric_id, e.rtime, e.rvalue,  d.metric_name) " +
            "FROM Metrics d left JOIN d.measures e")
    List<MeasureAndMetricsDto> fetchEmpPosDataRightJoin();
}

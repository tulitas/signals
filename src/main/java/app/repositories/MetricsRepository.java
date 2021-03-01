package app.repositories;

import app.models.Metrics;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetricsRepository extends CrudRepository<Metrics, Integer> {
}

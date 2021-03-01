package app.repositories;

import app.models.Sensors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorsRepository extends CrudRepository<Sensors, Integer> {
}

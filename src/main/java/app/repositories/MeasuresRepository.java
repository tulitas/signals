package app.repositories;

import app.models.Sensors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface MeasuresRepository extends CrudRepository<Sensors, Integer> {


}

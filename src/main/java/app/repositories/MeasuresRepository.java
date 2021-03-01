package app.repositories;

import app.models.Measures;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasuresRepository extends CrudRepository<Measures, Integer> {
}

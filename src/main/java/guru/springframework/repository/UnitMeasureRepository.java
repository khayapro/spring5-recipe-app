package guru.springframework.repository;

import guru.springframework.entities.UnitMeasure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitMeasureRepository extends JpaRepository<UnitMeasure, Long> {
}

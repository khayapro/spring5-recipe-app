package guru.springframework.repository;

import guru.springframework.entities.UnitMeasure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UnitMeasureRepository extends JpaRepository<UnitMeasure, Long> {

    Optional<UnitMeasure> findByDescription(String description);
}

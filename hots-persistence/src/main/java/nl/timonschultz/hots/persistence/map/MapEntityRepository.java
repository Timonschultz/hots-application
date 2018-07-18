package nl.timonschultz.hots.persistence.map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapEntityRepository extends JpaRepository<MapEntity, Long> {

    MapEntity existsAllById(Long id);
}

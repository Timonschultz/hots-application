package nl.timonschultz.hots.persistence.abilities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbilityEntityRepository extends JpaRepository<AbilityEntity, Long> {
}

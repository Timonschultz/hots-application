package nl.timonschultz.hots.persistence.heroes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroEntityRepository extends JpaRepository<HeroEntity, Long> {
}

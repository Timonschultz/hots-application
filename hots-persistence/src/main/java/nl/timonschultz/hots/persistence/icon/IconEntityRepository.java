package nl.timonschultz.hots.persistence.icon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IconEntityRepository extends JpaRepository<IconEntity, Long> {
}

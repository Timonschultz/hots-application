package nl.timonschultz.hots.persistence.talent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TalentEntityRepository extends JpaRepository<TalentEntity, Long> {
}

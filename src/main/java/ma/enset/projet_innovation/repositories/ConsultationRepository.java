package ma.enset.projet_innovation.repositories;

import ma.enset.projet_innovation.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}

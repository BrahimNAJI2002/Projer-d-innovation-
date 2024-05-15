package ma.enset.projet_innovation.repositories;

import ma.enset.projet_innovation.entities.DossierMedical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface DossierMedicalRepository extends JpaRepository<DossierMedical, Long> {
}

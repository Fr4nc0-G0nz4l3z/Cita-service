package cl.franco.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.franco.citas.model.Citas;





public interface CitaRepository extends JpaRepository<Citas,Long>{

}

package praxis.cl.proyectohospitalpost.repository;

import praxis.cl.proyectohospitalpost.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Integer> {

}

package praxis.cl.proyectohospitalpost.service.impl;

import praxis.cl.proyectohospitalpost.entities.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import praxis.cl.proyectohospitalpost.repository.IPacienteRepository;
import praxis.cl.proyectohospitalpost.service.ICrudGeneral;
import java.util.List;

@Service
public class PacienteServicioImpl implements ICrudGeneral <Paciente>  {

    @Autowired
    private IPacienteRepository pacienteRepo;
    @Override
    public List<Paciente> listar() {
        return  pacienteRepo.findAll();
    }

    @Override
    public Paciente buscarPorId(int id) {
        return pacienteRepo.findById(id).orElse(null);
    }

    @Override
    public Paciente crear(Paciente paciente) {
        return pacienteRepo.save(paciente);
    }

    @Override
    public Paciente actualizar(Paciente paciente) {
        return pacienteRepo.save(paciente);
    }

    @Override
    public void remover(int id) {
        pacienteRepo.deleteById(id);

    }
}

package praxis.cl.proyectohospitalpost.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import praxis.cl.proyectohospitalpost.entities.Paciente;
import praxis.cl.proyectohospitalpost.service.ICrudGeneral;

import java.util.List;


@Controller
@RequestMapping("/pacientes")
public class PacienteController {
   @Autowired
   private ICrudGeneral<Paciente> pacienteCrud;


    @GetMapping
    public String listarPacientes(Model model) {
        List<Paciente> pacientes = pacienteCrud.listar();
        model.addAttribute("pacientes", pacientes);
        return "paciente_list";
    }

}

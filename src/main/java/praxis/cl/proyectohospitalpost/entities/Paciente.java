package praxis.cl.proyectohospitalpost.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="nombre", nullable=false, length=50)
    private String nombre;

    @Column(name="apellido",nullable = false,length = 50)
    private String apellido;

    @Column(name="rut",nullable = false,length = 50)
    private String rut;

    @Column(name="ingreso",nullable = false)
    @DateTimeFormat (pattern ="dd-MM-yyyy" )
    private LocalDate ingreso;

    @Column(name="diagnostico",nullable = false,length=150)
    private String diagnostico;

    @Column(name="habitacion",nullable = false,length =50)
    private String habitacion;
}

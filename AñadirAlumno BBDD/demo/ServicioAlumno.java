/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer2.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jolun
 */

@Service
public class ServicioAlumno {
    private final alumnoRepository alumnoRepository;

    @Autowired
    public ServicioAlumno(alumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }
    public List<Alumno> obtenerTodosLosAlumnos() {
        return alumnoRepository.findAll();
    }
     public Alumno crearAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }
     public Alumno actualizarAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }
    
}

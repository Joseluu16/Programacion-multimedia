/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer2.demo;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author jolun
 */
@Data
@Entity
public class Alumno {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String DNI;
}

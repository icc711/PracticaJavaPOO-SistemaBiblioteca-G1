/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

import java.time.LocalDate;

/**
 *
 * @author LAB_04
 */
public class Autor {
    private String nombre;
    private String nacionalidad;
    private LocalDate fechadeNac;

    public Autor() {
    }

    public Autor(String nombre, String nacionalidad, LocalDate fechadeNac) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechadeNac = fechadeNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechadeNac() {
        return fechadeNac;
    }

    public void setFechadeNac(LocalDate fechadeNac) {
        this.fechadeNac = fechadeNac;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", fechadeNac=" + fechadeNac + '}';
    }                
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAB_04
 */
public class Autor {
    private String nombre;
    private String nacionalidad;
    private LocalDate fechadeNac;
    private ArrayList<String> titulos; 

    public Autor() {
        titulos = new ArrayList<>();
    }

    public Autor(String nombre, String nacionalidad, LocalDate fechadeNac) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechadeNac = fechadeNac;
        this.titulos = new ArrayList<>();
    }
    
    public List<String> buscarTitulo(){
        return titulos;
    }
    
    public String obtenerInfo(){
        return "Autor: " + nombre + " Nacionalidad: " + nacionalidad + " Nacimiento: " + fechadeNac;
    }
    
    public void agregarTitulo(String titulo){
        titulos.add(titulo);
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
        return "Autor{" + "nombre= " + nombre + ", nacionalidad= " + nacionalidad + ", fechadeNac= " + fechadeNac + '}';
    }                
}

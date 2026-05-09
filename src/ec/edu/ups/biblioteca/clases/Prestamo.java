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
public class Prestamo {
    private int codigoPrestamo;
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;
    private String estadoP;

    public Prestamo() {
    }

    public Prestamo(int codigoPrestamo, LocalDate fechaInicio, LocalDate fechaDevolucion, String estadoP) {
        this.codigoPrestamo = codigoPrestamo;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
        this.estadoP = estadoP;
    }

    public int getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public void setCodigoPrestamo(int codigoPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getEstadoP() {
        return estadoP;
    }

    public void setEstadoP(String estadoP) {
        this.estadoP = estadoP;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "codigoPrestamo=" + codigoPrestamo + ", fechaInicio=" + fechaInicio + ", fechaDevolucion=" + fechaDevolucion + ", estadoP=" + estadoP + '}';
    }
    
    
    
}

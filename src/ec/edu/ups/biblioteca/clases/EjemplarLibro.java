/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

/**
 *
 * @author LAB_04
 */
public class EjemplarLibro {
    private String codigoBarras;
    private String estadoL;
    private String ubicacion;

    public EjemplarLibro() {
    }

    public EjemplarLibro(String codigoBarras, String estadoL, String ubicacion) {
        this.codigoBarras = codigoBarras;
        this.estadoL = estadoL;
        this.ubicacion = ubicacion;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getEstadoL() {
        return estadoL;
    }

    public void setEstadoL(String estadoL) {
        this.estadoL = estadoL;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public void prestar(){
        estadoL = "Prestado";
    }
    public void devolver(){
        estadoL= "Disponible";
    }

    @Override
    public String toString() {
        return "EjemplarLibro{" + "codigoBarras=" + codigoBarras + ", estadoL=" + estadoL + ", ubicacion=" + ubicacion + '}';
    }            
}

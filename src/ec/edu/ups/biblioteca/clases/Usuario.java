/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

/**
 *
 * @author LAB_04
 */
//SUPER CLASE:
public class Usuario {
    private String nombre;
    private String cedula;
    private String correo;
    private String estado;
    

    public Usuario() {
    }

    public Usuario(String nombre, String cedula, String correo, String estado) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void suspender(){
        estado = "suspendido";
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + ", estado=" + estado + '}';
    }        
    
}

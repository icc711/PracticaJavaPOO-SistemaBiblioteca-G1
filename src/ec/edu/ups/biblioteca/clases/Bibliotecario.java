/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.ups.biblioteca.clases;

/**
 *
 * @author LAB_04
 */

//BIBLIOTECARIO HERRDA DE USUARIO :
//SUBCLASE:
public class Bibliotecario extends Usuario {
    private int idBibliotecario;

    public Bibliotecario() {
    }

    public Bibliotecario(String nombre, String cedula, String correo, String estado, int idBibliotecario) {
        super(nombre , cedula, correo , estado);// SUPER CLASE 
        this.idBibliotecario = idBibliotecario;
    }

    public int getIdBibliotecario() {
        return idBibliotecario;
    }

    public void setIdBibliotecario(int idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }

    public void registrarPrestamo(){
        System.out.println("Prestamo Registado");
        
    }
    public void registarDevolucion(){
        System.out.println("Devolucion Registrada");
        
    }

    @Override
    public String toString() {
        return "Bibliotecario{" + "idBibliotecario=" + idBibliotecario + '}' + super.toString();
    }        
    
}
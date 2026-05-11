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
    private String email;

    public Bibliotecario() {
    }

    public Bibliotecario(String nombre, String cedula, String correo, String estado, int idBibliotecario, String email) {
        super(nombre, cedula, correo, estado);// SUPER CLASE 
        this.idBibliotecario = idBibliotecario;
        this.email = email;
    }
    public void registrarPrestamo(Prestamo prestamo){
        System.out.println("Prestamo registrado por bibliotecario: " + getNombre());
        System.out.println(prestamo);
    }
    
    public void registrarDevolucion(Prestamo prestamo){
        prestamo.registrarDevolucion();
        System.out.println("Devolucion registrada por bibliotecario: " + getNombre());
    }
    
    public void buscarLibro(String titulo, java.util.List<Libro> libros){
        for (Libro l : libros){
            if (l.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Libro encontrado: " + l);
                return;
            }
        }
        System.out.println("Libro no encontrado: " + titulo);       
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
        return "Bibliotecario{" + "idBibliotecario = " + idBibliotecario + "Email = " + email + '}' + super.toString();
    }        
    
}
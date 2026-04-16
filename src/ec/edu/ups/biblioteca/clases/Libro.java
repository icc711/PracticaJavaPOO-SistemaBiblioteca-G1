/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

/**
 *
 * @author Lenovo
 */
public class Libro {
    
    public String titulo;
    public String autor;
    
    public void prestar(){
        System.out.println("Libro prestado: " + titulo + " - " + autor);
    }
    
}

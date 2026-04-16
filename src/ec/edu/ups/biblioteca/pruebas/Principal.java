/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.pruebas;

import ec.edu.ups.biblioteca.clases.Libro;
/**
 *
 * @author Lenovo
 */
public class Principal {
    public static void main(String args[]){
        
        // creamos un objeto a partir de la clase de libro
        // esto se llama instanciar un objeto
        Libro miLibro = new Libro ();
        miLibro.autor = "Joseph Jacobs";
        miLibro.titulo = "Los tres cerditos";
        
        Libro miLibro2 = new Libro ();
        miLibro2.autor = "Franz Kafka";
        miLibro2.titulo = "La metamorfosis";
        
        Libro miLibro3 = new Libro ();
        miLibro3.autor = "Sohn Won-pyung";
        miLibro3.titulo = "Almendra";
        
        Libro miLibro4 = new Libro ();
        miLibro4.autor = "Ichiro Kishimi";
        miLibro4.titulo = "El coraje de ser desagradable";
        
        Libro miLibro5 = new Libro ();
        miLibro5.autor = "Antoine de Saint-Exupery";
        miLibro5.titulo = "El principito";
        
        Libro miLibro6 = new Libro ();
        miLibro6.autor = "Hermann Hesse";
        miLibro6.titulo = "Demian";
        
        //  método prestar()
        miLibro.prestar();
        miLibro2.prestar();
        miLibro3.prestar();
        miLibro4.prestar();
        miLibro5.prestar();
        miLibro6.prestar();
    }
}    
    
    
    


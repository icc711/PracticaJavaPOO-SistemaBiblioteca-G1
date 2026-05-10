/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Libro{
    
    private String titulo;
    private int anioPublicacion;
    private String editorial;
    private String genero;
    private int numEjemplares;
    
    //AGRAGACION:
    //UN libro tiene autones pero no hay autor sin libro:
    private ArrayList<Autor> autores;
    //COMPPOSICION:
    //un libro tiene ejemplares:
    private ArrayList<EjemplarLibro> ejemplares;
    //Constructor vacio 
    public Libro() {
    }
    //constructor con datos
   public Libro(String titulo,
           int anioPublicacion,
           String editorial,
           String genero,
           int numEjemplares) {
       
       this.titulo = titulo;
       this.anioPublicacion = anioPublicacion;
       this.editorial = editorial;
       this.genero = genero;
       this.numEjemplares = numEjemplares;
       autores = new ArrayList<>();
       ejemplares = new ArrayList<>();
}
   public void agragarAutor(Autor autor){
       autores.add(autor);
   }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autores=" + autores + ", anioPublicacion=" + anioPublicacion + ", editorial=" + editorial + ", genero=" + genero + ", numEjemplares=" + numEjemplares + '}';
    }       
}

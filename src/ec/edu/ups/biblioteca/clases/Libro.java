/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

import java.util.ArrayList;
import java.util.List;

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
    //UN libro tiene autores pero no hay autor sin libro:
    private ArrayList<Autor> autores;
    //COMPOSICION:
    //un libro tiene ejemplares:
    private ArrayList<EjemplarLibro> ejemplares;
    //Constructor vacio 
    public Libro() {
        autores = new ArrayList<>();
        ejemplares = new ArrayList<>();
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
       
       for (int i=1; i <= numEjemplares; i++){
           ejemplares.add(new EjemplarLibro(titulo.substring(0, 3).toUpperCase() + 1, "Disponible", "Estante - " + i));
       }
    }
    
    public EjemplarLibro getEjemplarDisponible() {
    for (EjemplarLibro e : ejemplares) {
        if (e.verificarDisponibilidad()) return e;
    }
    return null;
}
    
    public void agregarAutor(Autor autor){
       autores.add(autor);
       autor.agregarTitulo(this.titulo);
    }
    
    public List<EjemplarLibro> buscarLibro(){
        return ejemplares;
    }
    
    public List<Autor> buscAutor(){
        return autores;
    }
    public int obtenerDisponible(){
        int count = 0;
        for (EjemplarLibro e : ejemplares){
            if (e.verificarDisponibilidad()) count++;
        }
        return count;
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
    
    public ArrayList<Autor> getAutores(){
        return autores;
    }
    
    public ArrayList<EjemplarLibro> getEjemplares(){
        return ejemplares;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", editorial=" + editorial + ", genero=" + genero + ", numEjemplares=" + numEjemplares + ", autores=" + autores + ", ejemplares=" + ejemplares + '}';
    }

        
}

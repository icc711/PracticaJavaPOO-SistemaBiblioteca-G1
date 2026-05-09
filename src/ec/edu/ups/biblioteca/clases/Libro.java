/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

/**
 *
 * @author Lenovo
 */
public class Libro{
    
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String editorial;
    private String genero;
    private int numEjemplares;

    public Libro() {
    }

    public Libro(String titulo, String autor, int anioPublicacion, String editorial, String genero, int numEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.editorial = editorial;
        this.genero = genero;
        this.numEjemplares = numEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion + ", editorial=" + editorial + ", genero=" + genero + ", numEjemplares=" + numEjemplares + '}';
    }
    
    
       
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

/**
 *
 * @author LAB_04
 */
public class Bibliotecario {
    private int idBibliotecario;
    private String email;
    private String nombreB;

    public Bibliotecario() {
    }

    public Bibliotecario(int idBibliotecario, String email, String nombreB) {
        this.idBibliotecario = idBibliotecario;
        this.email = email;
        this.nombreB = nombreB;
    }

    public int getIdBibliotecario() {
        return idBibliotecario;
    }

    public void setIdBibliotecario(int idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreB() {
        return nombreB;
    }

    public void setNombreB(String nombreB) {
        this.nombreB = nombreB;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" + "idBibliotecario=" + idBibliotecario + ", email=" + email + ", nombreB=" + nombreB + '}';
    }        
    
}

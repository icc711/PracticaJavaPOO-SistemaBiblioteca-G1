/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.pruebas;

import ec.edu.ups.biblioteca.clases.Autor;
import ec.edu.ups.biblioteca.clases.Bibliotecario;        
import ec.edu.ups.biblioteca.clases.EjemplarLibro;
import ec.edu.ups.biblioteca.clases.Libro;
import ec.edu.ups.biblioteca.clases.Prestamo;
import ec.edu.ups.biblioteca.clases.Usuario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Principal {
    
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            //LISTA PARA GUARDAR OBJETOS 
            ArrayList<Usuario> usuarios = new ArrayList<>();
            ArrayList<Libro> libros = new ArrayList<>();
            ArrayList<Prestamo> prestamos = new ArrayList<>();
            // menu con : crear usuario, crear libro. registar prestamo, devoluvion, mostrar prestamos y salir
            
            Bibliotecario admin = new Bibliotecario("Admin", "000", "admin@ups.edu.ec", "activo", 1, "admin@ups.edu.ec");
            
            int opcion;
            do{
                System.out.println("BIENVENIDO AL PROGRAMA :)");
                System.out.println("====MENU====");
                System.out.println("Seleccione una opcion:");
                System.out.println("1. Crear usuario. ");
                System.out.println("2. Crear libro. ");
                System.out.println("3. Registar prestamo. ");
                System.out.println("4. Registar devolucion. ");
                System.out.println("5. Mostrar prestamos. ");
                System.out.println("6. Mostrar info de autor.");
                System.out.println("7. Salir. ");
                opcion = sc.nextInt();
                sc.nextLine();
                
                switch (opcion) {
                // CREAR USUARIO
                case 1:

                    System.out.println("Ingrese nombre:");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese cedula:");
                    String cedula = sc.nextLine();

                    System.out.println("Ingrese correo:");
                    String correo = sc.nextLine();

                    System.out.println("Ingrese estado(suspendido/activo): ");
                    String estado = sc.nextLine();

                    Usuario usuario = new Usuario(nombre,cedula, correo, estado);
                    usuarios.add(usuario);
                    System.out.println("Usuario creado correctamente");

                    break;

                // CREAR LIBRO
                case 2:

                    System.out.println("Ingrese titulo: ");
                    String titulo = sc.nextLine();

                    System.out.println("Ingrese anio de publicacion: ");
                    int anio = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese editorial: ");
                    String editorial = sc.nextLine();

                    System.out.println("Ingrese genero: ");
                    String genero = sc.nextLine();

                    System.out.println("Ingrese numero de ejemplares: ");
                    int numEjemplares = sc.nextInt();
                    sc.nextLine();

                    Libro libro = new Libro(titulo, anio, editorial, genero,numEjemplares);
                    
                    System.out.println("Nombre del autor: ");
                    String nombreAutor = sc.nextLine();
                    System.out.println("Nacionalidad del autor: ");
                    String nacionalidad = sc.nextLine();
                    Autor autor = new Autor(nombreAutor, nacionalidad, LocalDate.of(1980, 1 ,1));  
                    libro.agregarAutor(autor);
                    
                    libros.add(libro);
                    System.out.println("Libro creado correctamente! : " + libro.obtenerDisponible() + " ejemplares disponibles." );

                    break;
                // REGISTRAR PRESTAMO
                case 3:
                    if(!usuarios.isEmpty() && !libros.isEmpty()) {
                        EjemplarLibro ejemplarDisponible = null;
                        
                        for (Libro l : libros){
                            ejemplarDisponible = l.getEjemplarDisponible();
                            if (ejemplarDisponible != null){
                                break;
                            }                        
                        }
                        if (ejemplarDisponible != null){
                            Prestamo prestamo = new Prestamo(prestamos.size() + 1, LocalDate.now(), LocalDate.now().plusDays(7), "Prestado", usuarios.get(0), ejemplarDisponible);
                            prestamo.registrar();
                            admin.registrarPrestamo(prestamo);
                            prestamos.add(prestamo);
                        } else {
                            System.out.println("No hay ejemplares disponibles.");
                        }
                    } else {
                        System.out.println("Debe crear usuarios y libros primero.");
                    }
                    break;
                // REGISTRAR DEVOLUCION
                case 4:
                    if(!prestamos.isEmpty()) {
                        admin.registrarDevolucion(prestamos.get(0));
                    } else {
                        System.out.println("No existen prestamos.");
                    }
                    break;
                // MOSTRAR PRESTAMOS
                case 5:
                    if(!prestamos.isEmpty()) {
                        for(Prestamo p : prestamos) {
                            System.out.println(p);
                        }
                    } else {
                        System.out.println("No hay prestamos registrados.");
                    }
                    break;

                case 6:
                    if (!libros.isEmpty()){
                        for (Autor a : libros.get(0).getAutores()){
                            System.out.println(a.obtenerInfo());
                            System.out.println("Titulos: " + a.buscarTitulo());
                        }
                    }else{
                        System.out.println("No hay libros registrados. ");
                    }
                    break;
                    
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        } while(opcion != 7);
    }
}

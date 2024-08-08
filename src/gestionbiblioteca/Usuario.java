package gestionbiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {


    private String nombre;
    private String apellido;
    private  String DNI;
    private List<Libro> librosPrestados;


    public Usuario(String nombre, String apellido, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.librosPrestados = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void prestarLibro(Libro libro){
        if (libro.getEstado()){
            libro.prestar();
            librosPrestados.add(libro);
        } else {
            System.out.println("Libro ya prestado: " + libro.getTitulo());
        }
    }


    public void devolverLibro(Libro libro){
        if (librosPrestados.contains(libro)){
            libro.devolver();
            librosPrestados.remove(libro);
        } else  {
            System.out.println("Libro no prestado: " + libro.getTitulo());
        }
    }


}

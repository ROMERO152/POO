package gestionbiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {


    private String nombre;
    private String direccion;
    private List<Libro> catalogo;
    private List<Usuario> usuarios;


    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.catalogo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Libro> getCatalogo() {
        return catalogo;
    }

    public List<Usuario> getUsuarios(){
        return usuarios;
    }


    public void agregarLibro(Libro libro){
        catalogo.add(libro);
    }


    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }


    public void prestarLibro(Usuario usuario, Libro libro){
        usuario.prestarLibro(libro);
    }


    public void devolverLibro(Usuario usuario, Libro libro){
        usuario.devolverLibro(libro);
    }

}

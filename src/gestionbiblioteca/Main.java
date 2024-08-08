package gestionbiblioteca;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Crear Biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Publica", "calle 167");

        //Crear libros
        Libro libro1 = new Libro("Don quijote", "Miguel de Cervantes", "1235554");
        Libro libro2 = new Libro("La divina comedia", "Dante", "12385584");

        //Agregar libros al catálogo
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        //Crear usuarios
        Usuario usuario1 = new Usuario("Juan ", "Perez ","1234");
        Usuario usuario2 = new Usuario("Ana ", "Lopez ","12345");

        //Registrar usuarios
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        //Prestar libros
        biblioteca.prestarLibro(usuario1, libro1);
        biblioteca.prestarLibro(usuario2, libro2);

        //mostrar libros prestados por usuario
        System.out.println("libros prestados por " + usuario1.getNombre() + "; ");
        for (Libro libro : usuario1.getLibrosPrestados()){
            System.out.println(libro.getTitulo());
        }

        System.out.println("libros prestados por " + usuario2.getNombre() + "; ");
        for (Libro libro : usuario2.getLibrosPrestados()){
            System.out.println(libro.getTitulo());
        }
        System.out.println("Libro " + usuario1.getLibrosPrestados());

        //Devolver Libros
        biblioteca.devolverLibro(usuario1, libro1);
        biblioteca.devolverLibro(usuario2, libro2);

        //Mostrar libros disponibles en biblioteca
        System.out.println("Libros disponibles en bilioteca: ");
        for (Libro libro : biblioteca.getCatalogo()){
            if (libro.getEstado()){
                System.out.println(libro.getTitulo());
            }
        }


    }
}

package dia21.biblioteca;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Fundamentos", "hhd",202);
        Libro libro2 = new Libro("Fundamentos de java", "hhfffd",2042);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        System.out.println("Libros disponibles");
        biblioteca.mostrarLibros();

        biblioteca.eliminarLibro(libro2);
        System.out.println("\nActualizacion despues de eliminar un libro");
        biblioteca.mostrarLibros();

    }
}

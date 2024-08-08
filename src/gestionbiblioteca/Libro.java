package gestionbiblioteca;

public class Libro {


    private String titulo;
    private String autor;
    private  String isbn;
    private boolean estado; //true = disponible, false = prestado


    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = true;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public void prestar(){
        if (estado){
            estado = false;
            System.out.println("Libro prestado: " + this.titulo);
        } else {
            System.out.println("Libro ya prestado: " + this.titulo);
        }

    }


    public void devolver(){
        if (!estado){ //cuando el libro está prestado
            estado = true;
            System.out.println("Libro devuelto: " + this.titulo);
        }else {
            System.out.println("Libro ya disponible: " + this.titulo);
        }
    }

    private static void mostrarLibrosPrestados(Usuario usuario) {
        System.out.println("Libros prestados por " + usuario.getNombre() + ":");
        if (usuario.getLibrosPrestados().isEmpty()) {
            System.out.println("No tiene libros prestados.");
        } else {
            for (Libro libro : usuario.getLibrosPrestados()) {
                System.out.println("- " + libro.getTitulo());
            }
        }
    }
}

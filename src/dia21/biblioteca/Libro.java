package dia21.biblioteca;

public class Libro {

    //Atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;

    //Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    //Getter and Setter
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


    //Método de comportamiento
    public  void mostrarDetalles(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año publicacion : " + this.anioPublicacion);
    }

    @Override
    public String toString() {
        return "\nTitulo " + titulo + "\nAutor: " + autor + "\nAño de publicación:" + anioPublicacion;
    }
}

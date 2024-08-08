package dia21.biblioteca;

import java.util.ArrayList;
import java.util.List;
//Composición relación: Tiene-un
public class Biblioteca {

    //Atributos
    //creamos una lista <> corchetes angulares
    //List<Libro> libros = new ArrayList<>();//List<tipo de dato> nombre = new arrayList

    //Atributos
    private List<Libro> libros;//composición ya que hacemos referencia a una clase

    //Constructor - Vamos a regresar aqui por no poner atencion
    //una lista siempre se tiene que inicializar
    public Biblioteca() {
       this.libros = new ArrayList<>(); //inicializamos con array list en el constructor en vez de hacerlo en los atributos
    }

    //Getter and Setter

    //Método de comportamiento
    public void agregarLibro(Libro libro){//Recibimos libro
        this.libros.add(libro); //Agregar libro
    }

    //Método para eliminar libro
    public void eliminarLibro(Libro libro){//Recibimos libro
        this.libros.remove(libro); //Eliminar libro
    }

    public void mostrarLibros(){
        if (this.libros.isEmpty()){//Comprueba si la lista esta vaciá
            System.out.println("No hay libros en la biblioteca");
        } else {
            for (Libro  libro: this.libros){//iteramos el tipo de dato libro con el nombre libro
                System.out.println(libro);//mostramos el libro
            }
        }
    }
}

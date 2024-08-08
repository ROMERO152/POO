package evaluacion.ejercicio9;

public class Gato extends Animal{

    //herencia de la clase animal
    //Constructor
    public Gato(String nombre, int edad){
        super(nombre, edad, "felino");
    }

    //traemos el metodo hacer sonido
    @Override
    public void hacerSonido(){
        super.hacerSonido();
        System.out.println("El gato maúlla");
        System.out.println(getNombre() + " dice: miau");
    }

    //Método mostrar detalles
    @Override
    public void mostrarDetalles(){
        System.out.println("\n****Datos del gato: ");
        super.mostrarDetalles();
    }

    //Método describir
    @Override
    public void describir(){
        System.out.println("\n****Nombre y edad del gato: ");
        super.describir();
    }
}

package evaluacion.ejercicio9;

public class Perro extends Animal{

    //Constructor
    public Perro(String nombre, int edad){
        super(nombre,edad,"canino");
    }

    @Override
    public void hacerSonido(){
        super.hacerSonido();
        System.out.println("🐶🐶El perro ladra");
        System.out.println(getNombre() + " dice: guau");
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("\n****Datos del perro: ");
        super.mostrarDetalles();
    }
    @Override
    public void describir(){
        System.out.println("\n****Nombre y edad del perro: ");
        super.describir();
    }

}

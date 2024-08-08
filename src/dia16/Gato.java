package dia16;

public class Gato extends Animal{

    //Atributos
    //Constructor
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    //Implementar metodo abstracto
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " Hace: ¡Miau Miau!");
    }
}

package dia16;
//Subclase
//las subclases también pueden ser abstractas solo se usan cuando sea necesario siempre y cuando este sea abstracto
public class Perro extends Animal{ //Es obligatorio implementar los métodos abstractos de la superclase

    //Constructor
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    //implementar metodo abstracto de la superclase
    @Override
    public  void hacerSonido() {
        System.out.println(getNombre() + "Hace: ¡Guau Guau!");
    }

}

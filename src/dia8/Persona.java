package dia8;
//Superclase (clase base)-clase padre

public class Persona {

    //Atributos
    private String nombre;
    private int edad;

    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //sobrecarga de constructores
    public Persona(String nombre){
        this.nombre = nombre;
    }

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo de comportamiento
    public void mostrarInformacion(){
        System.out.println("nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
}

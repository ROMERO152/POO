package dia14.polimorfismoestatico;
//Polimorfismo en tiempo de compilacion- poliformismo estático
//Con sobrecarga de constructores
public class Persona {

    private String nombre;
    private  int edad;

    //polimorfismo estatico es darle diferentes comportamientos a un mismo método
    //Constructor por edefecto o tambien conocido como metodo especial
    public Persona() {
        this("desconocido", 0);
    }

    //Constructor con un parámetro
    public Persona(String nombre) {
        this(nombre, 0);
    }

    //Constructor con dos parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public  void mostrarInfo(){
        System.out.println("nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);

    }
}

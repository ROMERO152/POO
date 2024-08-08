package dia3;

public class Persona {

    //Atributos
    private String nombre;
    private int edad;

    //sobrecarga de constructores, consiste en crear multiples constructores en la misma clase
    //deben tener el mismo nombre
    //Constructor por defecto
    public  Persona(){
        this.nombre = "Desconocido";//por buenas prácticas le damos valores
        this.edad = 0;
    }

    //Constructor con un parámetro
    public Persona(String nombre){
        this.nombre = nombre;
        this.edad = 0;
    }

    //constructor con un parámetro(int)
    public Persona(int edad){
        this.nombre = "Desconocido";
        this.edad = edad;
    }

    //Constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

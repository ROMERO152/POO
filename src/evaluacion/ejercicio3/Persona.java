package evaluacion.ejercicio3;

public class Persona {

    //Atributos
    private  String nombre;
    private  int edad;

    //constructor por defecto
    public Persona(){
        this("desconocido", 0);
    }

    //Constructor con un parámetro(nombre)
    public  Persona(String nombre){
        this(nombre , 0);
    }

    //Constructor con un parámetro(Edad)
    public Persona(int edad){
        this("desconocido", edad);//delegamos el constructor
    }

    //Constructor principal
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    //Método mostrar detalles
    public void mostrarDetalles(){
        System.out.println("Nombre: " + getNombre() + "\nEdad: " + getEdad() + "\n");
    }

    //Método presentarse
    public void presentarse(){
        System.out.println("Hola mi nombre es " + getNombre() + " y tengo " + getEdad() + "\n" );

    }
}

package dia3.delegacionconstructores;

public class Persona {

    //atributos
    private String nombre;
    private int edad;

    //constructor por defecto
    public Persona(){
        this("desconocido", 0);
    }

    //constructor con un parámetro
    public  Persona(String nombre){
        this(nombre, 0); //hacemos referencia al constructor principal cuando no ponemos un punto
    }

    public Persona(int edad){
        this("desconocido", edad);//delegamos el constructor
    }

    //constructor principal
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

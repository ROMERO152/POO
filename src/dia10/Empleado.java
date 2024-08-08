package dia10;

public class Empleado {

    //Atributos
    private  String nombre;
    private  int edad;

    //Constructor
    public Empleado(String nombre, int edad) {
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

    //Método mostrar información
    public void mostrarInformacion(){
        System.out.println("nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
}

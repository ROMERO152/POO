package dia21.tostring;

public class Persona {

    private  String nombre;
    private  int edad;


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


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


    //Método de comportamiento
    public void mostrarDetalles(){
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Edad: " + this.edad);
    }

    //hace lo mismo que mostrar detalles y es mas recomendable usarlo
    @Override
    public String toString() {//para representar objetos a travez de una cadena de caracteres
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad;
    }
}

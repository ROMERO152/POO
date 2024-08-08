package evaluacion.ejercicio9;

public class Animal {

    //Atributos
    private String nombre;
    private  int edad;
    private String especie;

    //Constructor
    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    //Método hacer sonido
    public void hacerSonido(){
        System.out.println("\nEl animal hace un sonido");
    }

    //Método mostrar detalles
    public void mostrarDetalles(){
        System.out.println("Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nEspecie: " + this.especie);
    }

    //Método describir animal
    public void describir(){
        System.out.println("Nombre: " + this.nombre + "\nEdad: " + this.edad);

    }



}

package dia16;
//Superclase

abstract public class Animal {//clase abstracta, agregarlo al inicio del modificador de acceso

    //Atributos
    private String nombre;
    private  int edad;

    //Constructor
    public Animal(String nombre, int edad) {
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

    //Métodos de abstracto a los normales se les conoce como métodos concretos
    //los métodos abstractos los usamos para obligar a otros a usar un metodo abstracto
    abstract public void hacerSonido ();//carecen de un cuerpo no llevan llaves, no se le agrega comportamiento

    //Método concreto
    public void dormir(){
        System.out.println(this.nombre + " Está durmiendo");
    }
}

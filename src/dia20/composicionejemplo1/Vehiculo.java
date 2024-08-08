package dia20.composicionejemplo1;

//Composicion tiene-un
//la diferencia entre herencia es la relacion es-un y composicion tiene-un
public class Vehiculo{

    //la diferencia se basa en el uso de atributos de una clase, como tipo de dato
    //composicion hacer referencia a otras clases a travez de atributos.
    //Atributos
    private String marca;
    private Motor motor; //Composición, creamos tipos de dato de tipo motor que es de la clase padre

    //Constructor
    public Vehiculo(String marca, Motor motor) { //Agregamos el tipo de dato motor
        this.marca = marca;
        this.motor = motor;
    }

    //Getter and Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    //Método de comportamiento
    public void mostrarDetalles(){
        System.out.println("marca del motor: " + this.marca + ", caballos de fuerza: " + this.motor.getCaballosDeFuerza());
    }
}

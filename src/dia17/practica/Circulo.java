package dia17.practica;

public class Circulo extends FiguraGeometrica{

    //Atributos
    private double radio;

    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //Getter and Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Implementar metodo abstracto
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    //Metodo concreto
    @Override
    public void mostrarDetalles(){
        System.out.println("***** Circulo *****");
        System.out.println("Radio: " + getRadio());
        super.mostrarDetalles();
    }
}

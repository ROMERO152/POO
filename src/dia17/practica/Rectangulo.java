package dia17.practica;

public class Rectangulo extends FiguraGeometrica{

    //Atributos
    public int base;
    public int altura;

    //Constructor
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //Getter and Setter
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //Implementar metodo abstracto
    @Override
    public double calcularArea() {
        return base * altura;
    }

    //Metodo concreto
    @Override
    public void mostrarDetalles(){
        System.out.println("***** Rectángulo *****");
        System.out.println("Base: " + getBase());
        System.out.println("Altura: " + getAltura());
        super.mostrarDetalles();
    }
}

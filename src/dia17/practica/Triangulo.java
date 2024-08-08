package dia17.practica;

public class Triangulo extends FiguraGeometrica{

    //Atributos
    private int base;
    public int altura;

    //Constructor
    public Triangulo(int base, int altura) {
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
        return (base * altura) / 2;
    }

    //Metodo concreto
    @Override
    public void mostrarDetalles(){
        System.out.println("***** Triangulo ***** ");
        System.out.println("Base: " + getBase());
        System.out.println("Altura: " + getAltura());
        super.mostrarDetalles();
    }
}

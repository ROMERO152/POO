package dia17.practica;

public class Main {
    public static void main(String[] args) {

        //objetos poliformismo dinamico
        FiguraGeometrica circulo = new Circulo(6);
        FiguraGeometrica rectangulo = new Rectangulo(5,6);
        FiguraGeometrica triangulo = new Triangulo(5,6);

        //Mostrar detalles
        circulo.mostrarDetalles();
        rectangulo.mostrarDetalles();
        triangulo.mostrarDetalles();
    }
}

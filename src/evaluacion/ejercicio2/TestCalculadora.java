package evaluacion.ejercicio2;

public class TestCalculadora {
    public static void main(String[] args) {

        Calculadora operaciones = new Calculadora();

        int resultadoSuma = operaciones.sumar(5,9);
        System.out.println(" \nLa suma es: " + resultadoSuma);

        int resultadoResta = operaciones.restar(10,5);
        System.out.println("La resta es: " + resultadoResta);

        int resultadoProducto = operaciones.multiplicar(9,6);
        System.out.println("El producto es: " + resultadoProducto);

        double resultadoDividir = operaciones.dividir(15,4);
        System.out.println("La division es: " + resultadoDividir);
    }
}

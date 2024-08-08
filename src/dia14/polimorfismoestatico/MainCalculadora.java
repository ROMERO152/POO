package dia14.polimorfismoestatico;

public class MainCalculadora {
    public static void main(String[] args) {


        Calculadora calculadora = new Calculadora();

        calculadora.sumar(5,5);
        System.out.println("suma de dos enteros: " + calculadora.sumar(5,6));
        System.out.println("suma de tres enteros: " + calculadora.sumar(5,6,8));
        System.out.println("suma de numeros decimales: " + calculadora.sumar(5.5,6));
    }
}

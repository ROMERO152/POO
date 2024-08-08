package dia5.sobrecargametodo;

public class MainCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("suma de dos numeros " + calculadora.sumar(3, 5));
        System.out.println("suma de tres numeros " + calculadora.sumar(3, 5, 2));
    }
}

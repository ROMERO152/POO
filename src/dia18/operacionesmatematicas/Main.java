package dia18.operacionesmatematicas;

public class Main {
    public static void main(String[] args) {

        CalculadoraImpl calculadora = new CalculadoraImpl();

        System.out.println("Suma: " + calculadora.sumar(10,5));
        System.out.println("Resta: " + calculadora.restar(10,5));
        System.out.println("Multiplicar: " +  calculadora.multiplicar(5,5));
        System.out.println("Division: " + OperacionesMatematicas.dividir(10,2));//llamamos a la interfaz

    }
}

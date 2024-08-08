package evaluacion.ejercicio7;

public class TestMathOperations {
    public static void main(String[] args) {

        MathOperations operaciones = new MathOperations();

        // Llamamos al método multiplicar con dos enteros
        int resultado1 = operaciones.multiplicar(6, 9);
        System.out.println("\nEl resultado de la multiplicación de dos números es: " + resultado1);

        // Llamamos al método multiplicar con tres enteros
        int resultado2 = operaciones.multiplicar(8, 2, 5);
        System.out.println("El resultado de la multiplicación de tres números es: " + resultado2);

        //Suma con varargs
        int suma = operaciones.sumar(5, 62, 30);
        System.out.println("Resultado de la suma es: " + suma);
    }
}

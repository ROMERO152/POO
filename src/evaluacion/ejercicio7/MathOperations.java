package evaluacion.ejercicio7;

public class MathOperations {

    // Método para multiplicar dos enteros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para multiplicar tres enteros
    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    //Método con varargs
    public int sumar(int... numeros){
        int suma = 0;
        for ( int numero : numeros){
            suma += numero;
        }
        return suma;
    }

}

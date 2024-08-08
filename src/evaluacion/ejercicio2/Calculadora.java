package evaluacion.ejercicio2;

public class Calculadora {


    //Método sumar
    public  int sumar(int a, int b){
        return a + b;
    }

    //Método restar
    public int restar(int a, int b){
        return a - b;
    }

    //Método multiplicar
    public int multiplicar(int a, int b ){
        return a * b;
    }

    //Método dividir
    public double dividir(double a, double b){
        if (b == 0) { //Condicional cuando b = 0
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
       return  a / b;
    }
}

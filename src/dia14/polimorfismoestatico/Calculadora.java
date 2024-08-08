package dia14.polimorfismoestatico;
//polimorfismo en tiempo de compilacion- polimorfismo estatico
//Se llama en tiempo de compilacion por que son llamados despues de la compilacion
//con sobrecarga de métodos
public class Calculadora {


    //método para sumar dos enteros
    public int sumar(int a, int b){
        return  a + b;
    }

    //metodo para sumar 3 enteros
    public int sumar(int a, int b, int c){
        return  a + b + c;
    }

    //Método para sumar dos números de tipo double
    public  double sumar(double a, double b){
        return a + b;
    }
}

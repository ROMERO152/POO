package dia6.metodosstaticos;

public class Calculadora {

    //Métodos estáticos, no pueden ser usados o llamados por objetos solo se usan por la clase
    //no podemos implementar polimorfismo en métodos estáticos
    public static int sumar(int a, int b){
        return  a + b;
    }

    public static int restar(int a, int b){
        return a - b;
    }
}

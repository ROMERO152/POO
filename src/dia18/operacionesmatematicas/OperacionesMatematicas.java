package dia18.operacionesmatematicas;

public interface OperacionesMatematicas {

    int sumar(int a, int b);
    int restar(int a, int b);

    //se pueden invocar desde el main ya que es un metodo por defecto
    default  int multiplicar(int a, int b){//Esto no se debe de hacer ya que contiene logica
        return  a * b;
    }

    static  int dividir(int a, int b){
        if (b == 0){//cuando la condición se cumpla
            throw  new ArithmeticException("No se puede dividir por cero");//Esto no se debe de hacer
        }
        return  a / b;
    }
}

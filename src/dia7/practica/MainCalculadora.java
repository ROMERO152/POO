package dia7.practica;

public class MainCalculadora {
    public static void main(String[] args) {

        //objeto
        Calculadora calculadora = new Calculadora();

        calculadora.operacion("suma",1,2,3,4);
        calculadora.operacion("producto",1,2,3);

        int resultadoSuma = calculadora.operacion("suma",1 , 2, 3);
        System.out.println(resultadoSuma);

        int resultadoProducto = calculadora.operacion("producto", 1, 2, 5);
        System.out.println(resultadoProducto);
    }


}

package dia7;

public class MainSumador {
    public static void main(String[] args) {


        //objeto
        Sumador sumador = new Sumador();

        int resultadoSuma = sumador.sumar(1,2,3);
        System.out.println(resultadoSuma);

        resultadoSuma = sumador.sumar(10,20,30,40,50,1);
        System.out.println(resultadoSuma);
    }
}

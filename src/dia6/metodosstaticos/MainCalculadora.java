package dia6.metodosstaticos;


public class MainCalculadora {
    public static void main(String[] args) {

        //,andamos llamar el método
        int resultadoSuma = Calculadora.sumar(5, 6);

        //guardamos el resultado del método sumar en el atributo resultadoResta
        int resultadoResta = Calculadora.restar(10, 5);

        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
    }
}

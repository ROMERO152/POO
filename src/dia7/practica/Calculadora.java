package dia7.practica;

public class Calculadora {

    //metodo
    public int operacion(String operador, int...numeros){//el varargs siempre debe ir al final

        int resultadoOperacion = 0;

        if (operador.equalsIgnoreCase("suma")){
            for (int i = 0; i < numeros.length; i++){
                resultadoOperacion += numeros[i];
            }
            return resultadoOperacion;

        } else if (operador.equalsIgnoreCase("producto")) {
            resultadoOperacion = 1; //inicializamos
            for (int num : numeros){ //for each iterador
                resultadoOperacion *= num;
            }
            return resultadoOperacion;
        }
        return  resultadoOperacion;
    }
}

package dia7;

public class Sumador {
    //varargs (numero variable de argumentos)

    //estructura basica de varargs
    public int sumar(int... numeros){//esta abierto a recibir 1 o mas parametros de tipo int,solo podemos tener un varargs
        int suma = 0;
        for (int num :numeros){
            suma += num;
        }
        return suma;
    }
}

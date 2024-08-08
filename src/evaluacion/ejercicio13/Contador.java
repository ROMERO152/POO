package evaluacion.ejercicio13;

public class Contador {

    //Atributos
    public static int  conteo = 0;

    //Constructor
    public Contador(){
        conteo++;
    }

    //Mostrar conteo
    public static void mostrarConteo(){
        System.out.println("\nValor actual de conteo: " + conteo);
    }
}

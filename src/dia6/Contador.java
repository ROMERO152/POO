package dia6;

public class Contador {

    //Atributos estaticos,tambien conocidos como atributos de clase es el que pertenece exclusivamente a la clase y no a los objetos
    //por lo cual no podemos acceder a ellas por medio de objetos
    private static int contador = 0;

    //Constructor
    public Contador(){
        contador++;
    }//el contador incrementa uno en uno

    //Método sin retorno
    public void mostrarContador(){
        System.out.println("Instancias totales: " + contador);
    }
}

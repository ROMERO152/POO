package dia20.composicionejemplo2;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Procesador procesador = new Procesador("intel");
        Memoria memoria = new Memoria(123);

        Computadora computadora = new Computadora(procesador,memoria);

        System.out.println("Especificaciones de la memoria");
        computadora.mostrarDetalles();
    }
}

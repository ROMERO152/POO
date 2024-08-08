package dia17.sistemaempleadoabstracto;

public class Main {
    public static void main(String[] args) {

        //Objetos
        Empleado tiempoCompleto = new EmpleadoTiempoCompleto(
                5,
                "Eliseo",
                5622,
                500);
        Empleado tiempoParcial = new EmpleadoTiempoParcial(
                6,
                "Ana lopez",
                100,
                80,
                12);

        //Mostrar detalles
        tiempoCompleto.mostrarDetalles();
        tiempoParcial.mostrarDetalles();

    }
}

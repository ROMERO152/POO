package dia10;

public class Main {
    public static void main(String[] args) {

        //objetos
        Empleado empleado  = new Empleado(
                "juan",
                25);

        Abogado abogado = new Abogado(
                "mario",
                42,
                "abogado",
                3);

        Asistente asistente = new Asistente(
                "Jorge",
                35,
                "luis",
                "universidad");

        Recepcionista recepcionista = new Recepcionista(
                "Laura",
                26,
                "matutino",
                "ingles", "frances");


        //mostrar información por departamento
        System.out.println("informacion Empleado");
        empleado.mostrarInformacion();
        System.out.println();

        System.out.println("informacion abogado");
        abogado.mostrarInformacion();
        System.out.println();

        System.out.println("informacion asistente");
        asistente.mostrarInformacion();
        System.out.println();

        System.out.println("informacion recepcionista");
        recepcionista.mostrarInformacion();
    }
}

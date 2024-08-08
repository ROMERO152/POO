package dia9;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona(
                "eliseo",
                25);
        Alumno alumno = new Alumno(
                "juan",
                12,
                "primaria",
                9.8);
        Profesor profesor = new Profesor(
                "david",
                45,
                2,
                "mate", "geo", "bio");
        Empleado empleado = new Empleado(
                "jose",
                26,
                "profe",
                "8:00 - 14:00");

        System.out.println("informacion persona");
        persona.mostrarInformacion();
        System.out.println();
        System.out.println("informacion alumno");
        alumno.mostrarInformacion();
        System.out.println();
        System.out.println("informacion profesor");
        profesor.mostrarInformacion();
        System.out.println();
        System.out.println("informacion empleado");
        empleado.mostrarInformacion();
    }
}

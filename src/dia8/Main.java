package dia8;

public class Main {
    public static void main(String[] args) {

        //objeto par interactuar con una clase persona y alumno
        Persona persona = new Persona("Eliseo Romero", 20);
        Alumno alumno = new Alumno("juan", 12, "GGF125", "SISTEMAS");
        Profesor profesor = new Profesor ("Carlos garcia ", 40,"Matematicas",2000);

        persona.mostrarInformacion();
        System.out.println();
        alumno.mostrarInformacion();
        System.out.println();
        profesor.mostrarInformacion();
    }
}

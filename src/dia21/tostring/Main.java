package dia21.tostring;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("juan ",22);

        //uso de mostrar detalles
        persona.mostrarDetalles();

        //uso de to string
        System.out.println(persona.toString());
    }
}

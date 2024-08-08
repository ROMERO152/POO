package dia14.polimorfismoestatico;

public class MainPersona {
    public static void main(String[] args) {

        //Demostracion de poliformismo
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("juan");
        Persona persona3 = new Persona("ana", 25);


        persona1.mostrarInfo();

    }
}

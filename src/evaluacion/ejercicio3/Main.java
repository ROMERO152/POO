package evaluacion.ejercicio3;

public class Main {
    public static void main(String[] args) {

        //Objeto
        Persona persona1 = new Persona("Jorge Lopez",22);
        Persona persona2 = new Persona("Maria Perez");
        Persona persona3 = new Persona(25);
        Persona persona4 = new Persona();


        //imprimir detalles
        System.out.println("\n***Persona uno***");
        persona1.mostrarDetalles();
        persona1.presentarse();//Método presentarse

        System.out.println("***Persona dos***");
        persona2.mostrarDetalles();
        persona2.presentarse();//Método presentarse

        System.out.println("***Persona tres***");
        persona3.mostrarDetalles();
        persona3.presentarse();//Método presentarse

        System.out.println("***Persona cuatro***");
        persona4.mostrarDetalles();
        persona4.presentarse();//Método presentarse

    }
}

package dia2;

public class Main {

    public static  void  main(String[]args){

        //crear instancias (objetos)

        Persona persona1 = new Persona("carlos",14,"Doctor");
        Persona persona2 = new Persona("juan", 34, "ingeniero");
        Persona persona3 = new Persona("maria",22,"profesor");

        //mostrar datos de cada persona
        persona1.mostrarDetalles();
        System.out.println();

        persona2.mostrarDetalles();
        System.out.println();

        persona3.mostrarDetalles();
    }
}

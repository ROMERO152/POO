package dia2.libro;

public class Main {
    public static  void  main(String[]args){


        //crear instancias (objetos)
        Libro libro1 = new Libro(
                "Divina comedia",
                "Dante Alighieri",
                1321,
                200.50);

        Libro libro2 = new Libro(
                "Orgullo y prejuicio",
                "Jane Austen",
                1813,
                150.99);

        Libro libro3 = new Libro(
                "Papá Goriot",
                "Honore de balzac",
                1835,
                100.2);


        //Mostar datos de cada libro
        System.out.println("Libro 1: ");
        libro1.mostrarDetalles();//instancia del objeto
        System.out.println();

        System.out.println("Libro 2:");
        libro2.mostrarDetalles();
        System.out.println();

        System.out.println("Libro 3:");
        libro3.mostrarDetalles();
    }
}

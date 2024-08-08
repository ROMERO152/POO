package evaluacion.ejercicio1;

public class Biblioteca {
    public static void main(String[] args) {

        //objetos
        Libro libro1 = new Libro("Leyendas de herbozonia", "Alberto Prieto", 292);
        Libro libro2 = new Libro("La corriente de un rio", "Ramiro Pinto", 720);
        Libro libro3 = new Libro("Volver", "Javier Martin", 58);


        //Método mostrar detalles

        System.out.println("\n ****Biblioteca****\n");

        System.out.println("Libro 1");
        libro1.mostrarInformacion();

        System.out.println("Libro 2");
        libro2.mostrarInformacion();

        System.out.println("Libro 3");
        libro3.mostrarInformacion();
    }
}

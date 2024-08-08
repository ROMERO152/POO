package dia6.practica;

public class MainBanco {
    public static void main(String[] args) {

        Banco cliente1 = new Banco("eliseo", 1000);
        Banco cliente2 = new Banco("Maria",2000);

        cliente1.mostrarDetalles();
        System.out.println();
        cliente2.mostrarDetalles();

        //accedemos al metodo por medio de la clase, sin crear objetos
        Banco.cambiarTasaInteres(5);

        System.out.println();
        cliente1.mostrarDetalles();
        System.out.println();
        cliente2.mostrarDetalles();
    }
}

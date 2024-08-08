package evaluacion.ejercicio9;

public class Main {
    public static void main(String[] args) {

        //Objetos
        Perro perro = new Perro("boby",5);
        Gato gato = new Gato("Pelusa", 3);

        //Metodo hacer sonido
        perro.hacerSonido();
        gato.hacerSonido();

        //Metodo mostrar detalles
        perro.mostrarDetalles();
        gato.mostrarDetalles();

        //Describir
        perro.describir();
        gato.describir();
    }
}

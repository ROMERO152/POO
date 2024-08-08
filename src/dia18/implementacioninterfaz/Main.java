package dia18.implementacioninterfaz;

public class Main {
    public static void main(String[] args) {

        //crear objetos de coche
        CocheImpl coche = new CocheImpl();

        //polimorfismo desde vehiculo
        Vehiculo coche2 = new CocheImpl(); //Esto solo cuando no hay mucha logica

        coche.arrancar();
        coche.acelerar(30);
        coche.detener();

    }
}

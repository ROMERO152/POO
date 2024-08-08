package dia20.composicionejemplo1;

public class Main {
    public static void main(String[] args) {

        Motor motorVX3 = new Motor(1256);
        Vehiculo vehiculo = new Vehiculo("Toyota", motorVX3);//nos pide el objeto motor

        System.out.println("Detalles del motor en el vehiculo");
        vehiculo.mostrarDetalles();

    }
}

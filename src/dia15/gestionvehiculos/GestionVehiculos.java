package dia15.gestionvehiculos;

public class GestionVehiculos {
    public static void main(String[] args) {

        //objetos
        //aplicar polimorfismo
        Vehiculo vehiculo1 = new Auto("Toyota ", "Corolla", 2024, 4);
        Vehiculo vehiculo2 = new Motocicleta("BMW", "abc", 2020, true);
        Vehiculo vehiculo3 = new Camion("volvo", "trx",25);


        //Mostrar detalles
        vehiculo1.mostrarDetalles();
        vehiculo2.mostrarDetalles();
        vehiculo3.mostrarDetalles();

        //Realizar mantenimiento
        vehiculo1.realizarMantenimiento();
        vehiculo2.realizarMantenimiento();
        vehiculo3.realizarMantenimiento();

        System.out.println("");

        //registrar servicios varargs
        vehiculo1.registrarServicios("cambio", "hghgjh");
        vehiculo2.registrarServicios("camfuysdhghdio", "hghgjh");
        vehiculo3.registrarServicios("cambghjdghgio", "hgdgjhghgjh");

        System.out.println("");

        //Mostrar contador de vehiculos
        System.out.println("registro de vehiculos: " + Vehiculo.obtenerContadorVehiculos());
        Vehiculo.obtenerContadorVehiculos();
    }
}

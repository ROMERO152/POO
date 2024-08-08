package dia15.gestionvehiculos;

public class Camion extends Vehiculo{

    private double capacidadCarga;

    public Camion(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Camion(){
        this("desconocida", "desconocida", 0, 0);
    }

    public Camion(String marca, String modelo, int anio) {
        this(marca, modelo, anio,5);
    }
    public Camion(String marca, String modelo, int anio, double capacidadCarga) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }

    //Método mostrar detalles
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Capacidad de carga: " + this.capacidadCarga + "toneladas ");
    }

    //Metodo realizar mantenimiento
    public void realizarMantenimiento() {
        System.out.println("El camión está en mantenimiento: capacidad de carga ");
    }
}

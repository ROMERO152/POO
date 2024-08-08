package dia15.gestionvehiculos;

public class Auto extends Vehiculo {

    //Atributo adicional
    private int numeroPuertas;

    //Sobrecarga de constructores
    //Constructor por defecto
    public Auto(){
        this("desconocida", "desconocida", 0, 0);//valores por defecto
    }

    //Constructor 3 parametros
    public  Auto(String marca, String modelo, int anio){
        this(marca,modelo, anio, 0);
    }

    //Constructor principal
    public Auto(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    //Método mostrar detalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + this.numeroPuertas);
    }

    //Sobre escritura de métodos
    //Metodo realizar mantenimiento
    @Override
    public void realizarMantenimiento() {
        System.out.println("El auto está en mantenimiento. verificar puertas ");
    }
}

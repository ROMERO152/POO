package dia15.gestionvehiculos;
//Superclase
public class Vehiculo {

    //Atributos heredables
    private String marca;
    private String modelo;
    private int anio;

    //Atributo estático siempre se inicializan en 0
    private static int contadorVehiculos = 0;

    //Constructor por defecto o método especial
    public Vehiculo() {
        this("desconocida", "desconocida", 0);//valores por defecto
    }

    //Constructor principal
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        contadorVehiculos++;//cada que se haga un registro de un nuevo vehiculo se agrega a contador de autos
        //siempre y cuando tenga todos los datos requeridos.
    }

    //Getter and Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //Método para contador de vehículos estático
    public static int obtenerContadorVehiculos() {
        return contadorVehiculos;
    }

    //Método mostrar detalles
    public void mostrarDetalles() {
        System.out.println("\nMarca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.anio + "\n");
    }

    //Metodo realizar mantenimiento
    public void realizarMantenimiento() {
        System.out.println("El vehiculo está en mantenimiento: ");
    }

    //Método registrar servicios por medio de varargs
    public void registrarServicios(String... servicios) {
        System.out.println("Servicios registrados: ");
        for (String servicio : servicios) { //iteramos la informacio recibida en servicios y los guardamos en servicio
            System.out.println("- " + servicio);
        }
    }
}

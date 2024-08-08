package dia1;

public class Automovil {
    //atributos son variables
    //atributos caracteristicas que identifican a un objeto
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    //poblar es asignar datos
    //Constructor siempre debe ser publico y llamarse como mi clase principal (Automovil)
    //el constructor se encarga de poblar nuestros atributos
    //creamos parametros dentro del constructor para recibir los datos de las variables
    //estos deben llamarse igual que las variables
    //cuando nosotros enviamos datos de una clase a otra los parametros se llaman argumentos
    public Automovil(String marca, String modelo, int anio, double precio) {
        //bloques de codigo para poblar los atributos(variables)
        //un constructor sirve para poblar nuestros atributos
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    //los metodos son para definir el comportamiento de nuestros atributos
    //metodos Getter y Setter permiten consultar o modificar los datos
    //dentro de un atributo privado
    //get retorna el contenido actual de nuestro atributo
    public String getMarca() {
        return marca;
    }

    //siempre debe llevar void
    //asigna un nuevo valor a marca
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //metodo de comportamiento
    public void mostrarDetalles() {
        System.out.println("marca:" + marca);
        System.out.println("modelo:" + modelo);
        System.out.println("Año:" + anio);
        System.out.println("precio:" + precio);
    }

}

package practicapersonal;

public class Producto {

    //Atributo estatico
    private  static double descuentoGlobal = 0.0;

    //Atributos
    private String nombre;
    private  double precio;
    private int cantidad;
    //constructor con dos parametros
    public  Producto(String nombre, double precio){
        this(nombre,precio, 0);
    }

    //Constructor principal
    public  Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //metodos de comporamiento
    //Método calcular valor total
    public  double calcularValorTotal(){
        return precio - (precio * descuentoGlobal/100) * cantidad;
    }

    //Método aplicar descuento
    public static void aplicarDescuentoGlobal(double descuento){
        descuentoGlobal = descuento;
    }

    //metodo para incrementar cantidad
    public void  incrementarCantidad(int Cantidad){
        if(cantidad< 0){
            System.out.println("la cantidad a incrementar no puede ser negativo");
        }
        this.cantidad += cantidad;
    }

    //metodo para crear producto
    public static  Producto crearProducto(String nombre, double precio){
        return new Producto(nombre,precio);
    }
}

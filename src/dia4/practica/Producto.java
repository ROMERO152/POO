package dia4.practica;

public class Producto {

    //Atributos
    private  String nombre;
    private int codigo;
    private String categoria;
    private  double precio;


    //Constructor por defecto
    public Producto() {
        this("Desconocido", 0, "Desconocido",0.0);
    }

    //constructor con un parametro(Nombre)
    public Producto(String nombre) {
        this(nombre,0, "Desconocido",0.0);
    }

    //Constructor con dos parametros
    public Producto(String nombre, int codigo) {
        this(nombre, codigo, "Desconocido",0.0);
    }

    //Constructor con 3 parametros(nombre, codigo y categoria
    public Producto(String nombre, int codigo, String categoria) {
        this(nombre, codigo, categoria,0.0);
    }

    //Constructor principal
    public Producto(String nombre, int codigo, String categoria, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.precio = precio;
    }

    //Metodos Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Métodos de comportamiento
    //Método calcular precio con impuestos
    public double calcularPrecioConImpuestos(double porcentajeImpuesto){
        return this.precio += precio * (porcentajeImpuesto / 100);
    }

    //Método para aplicar Descuento
    public void aplicarDescuento(double porcentajeDescuento){
        if (porcentajeDescuento > 0){
            this.precio -= this.precio *(porcentajeDescuento/100);
        }
    }

    //Método Imprimir Detalles
    public  void  imprimirDetalles(){
        System.out.println(
                "Nombre: " + this.nombre
                        + ", codigo: " + this.codigo
                        + ", categoria: " + this.categoria
                        + ", precio: " + this.precio);
    }
}

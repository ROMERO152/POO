package dia4;

public class Empleado {

    //atributos
    private String nombre;
    private  int id;
    private String puesto;
    private  double salarioMensual;

    //constructor por defecto
    public  Empleado(){
        this("desconocido", 0, "desconocido", 0.0);
    }

    //constructor con un parametro
    public Empleado(String nombre) {
        this(nombre, 0, "desconocido", 0.0);
    }

    //constructor con dos parametros
    public Empleado(String nombre, int id) {
        this(nombre,id, "desconocido", 0.0);
    }

    //constructor con 3 parametros
    public Empleado(String nombre, int id, String puesto) {
        this(nombre, id, puesto, 0.0);
    }
    //Constructor principal
    public Empleado(String nombre, int id, String puesto, double salarioMensual ){
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
        this.salarioMensual = salarioMensual;

    }

    //metodo Getter y Setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    //método de comportamiento
    //método para calcular el salario anual
    public double calcularSalarioAnual() {
        return this.salarioMensual * 12; //indicamos que hacemos referencia a un atributo con this por buenas practicas
    }

    //método aplicar aumento
    public void aplicarAumento(double porcentaje){
        if (porcentaje >0){
            this.salarioMensual += this.salarioMensual * (porcentaje / 100);
        }
    }

    //Método para imprimir detalles del empleado
    public  void imprimirDetalles(){
        System.out.println(
                "Nombre: " + this.nombre
                        + ", ID: " + this.id
                        + ",Puesto: " + this.puesto
                        + ", Salario Mensual: " + this.salarioMensual);
    }
}

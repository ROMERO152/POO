package dia17.sistemaempleadoabstracto;
//Superclase

abstract public class Empleado {

    //Atributos
    private  int id;
    private String nombre;
    private double salarioBase;

    //Constructor
    public Empleado(int id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    //Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //Métodos de comportamiento
    //método abstracto
    abstract public double calcularSalario();

    //Método concreto
    public void mostrarDetalles (){
        System.out.println("\nID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Salario: " + calcularSalario());
    }
}

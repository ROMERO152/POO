package dia17.sistemaempleadoabstracto;
//subclase

public class EmpleadoTiempoCompleto  extends  Empleado{

    //Atributos
    private double bono;

    //Constructor
    public EmpleadoTiempoCompleto(int id, String nombre, double salarioBase, double bono) {
        super(id, nombre, salarioBase);
        this.bono = bono;
    }

    //Getter and Setter

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    //implementar metodo abstracto
    @Override
    public double calcularSalario() {
        return getSalarioBase() + this.bono;
    }
}

package dia17.sistemaempleadoabstracto;
//Subclase

public class EmpleadoTiempoParcial extends Empleado{

    //Atributos
    private int horasTrabajadas;
    public double tarifaPorHora;

    //Constructor
    public EmpleadoTiempoParcial(
            int id,
            String nombre,
            double salarioBase,
            int horasTrabajadas,
            double tarifaPorHora) {

        super(id, nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    //Getter and Setter
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    //Implementar metodo abstracto
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (this.horasTrabajadas * this.tarifaPorHora);
    }
}

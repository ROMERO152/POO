package dia8;

public class Profesor extends Persona {

    private String especialidad;
    private  double salario;

    public Profesor(String nombre, int edad, String especialidad, int salario){
        super(nombre,edad);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Salario: " + this.salario);
    }
}

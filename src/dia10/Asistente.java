package dia10;

public class Asistente extends Empleado{

    //Atributos
    private String supervisor;
    private String nivelEstudios;

    //Constructor
    public Asistente(String nombre, int edad, String supervisor, String nivelEstudios) {
        super(nombre, edad);
        this.supervisor = supervisor;
        this.nivelEstudios = nivelEstudios;
    }

    //Getter and Setter
    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getNivelEstudios() {
        return nivelEstudios;
    }

    public void setNivelEstudios(String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    //Método mostrar información
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Supervisor: " + this.supervisor);
        System.out.println("Nivel de estudios: " + this.nivelEstudios);
    }
}

package dia10;


public class Abogado extends Empleado {

    //Atributos
    private String especialidad;
    private  int aniosExperiencia;

    //Constructor
    public Abogado(String nombre, int edad, String especialidad, int aniosExperiencia) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    //Getter and Setter
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    //Método de Comportamiento
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Años de experiencia: " + this.aniosExperiencia);
    }
}

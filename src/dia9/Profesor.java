package dia9;

public class Profesor extends Persona{

    private String[] especialidades;//arreglo para recibir varios string
    private int aniosExperiencia;

    public Profesor(String nombre, int edad, int aniosExperiencia, String...especialidades){//varargs
        super(nombre,edad);
        this.especialidades = especialidades;
        this.aniosExperiencia = aniosExperiencia;

    }

    //Getter and Setter
    public String[] getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String[] especialidades) {
        this.especialidades = especialidades;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    //Metodo de comportamiento
    @Override
    public  void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Especialidades: " + String.join(",", this.especialidades));//join se usa para imprimir arreglos
        //System.out.println(Arrays.toString(especialidades));//funciona como el join la diferencia es el delimitador
        System.out.println("Años de experiencia: " + this.aniosExperiencia);
    }
}

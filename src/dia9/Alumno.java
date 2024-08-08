package dia9;

public class Alumno extends Persona {

    //Atributos
    private String grado;
    private double promedio;

    public Alumno(String nombre, int edad, String grado, double promedio) {
        super(nombre, edad);//llamado al constructor
        this.grado = grado;//poblar atributos
        this.promedio = promedio;
    }

    //Getter and Setter
    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public  void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Grado: " + this.grado);
        System.out.println("Promedio: " + this.promedio);
    }
}

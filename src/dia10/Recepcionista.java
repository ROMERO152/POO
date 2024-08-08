package dia10;

public class Recepcionista extends Empleado{

    //Atributos
    private String turno;
    private String[] idiomas;

    //Constructor

    public Recepcionista(String nombre, int edad, String turno, String...idiomas ){
        super(nombre, edad);
        this.turno = turno;
        this.idiomas = idiomas;
    }

    //Getter and Setter

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    //Método mostrar información
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Turno: " + this.turno);
        System.out.println("Idiomas: " + String.join(", ", this.idiomas));
    }
}

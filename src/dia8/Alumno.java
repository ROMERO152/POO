package dia8;
//subclase (clase derivada)-clase hija
public class Alumno extends Persona{//para aplicar usamos la palabra extends y el nombre la superclase

    //Atributos
    private String matricula;
    private String carrera;

    //Constructor
    public Alumno(String nombre,int edad, String matricula, String carrera){
        super(nombre,edad);//indica que voy a usar algo de la superclase en este caso nombre y edad
        this.matricula = matricula;
        this.carrera = carrera;
    }
    public Alumno(String nombre, String matricula, String carrera){
        super(nombre);
        this.matricula = matricula;
        this.carrera = carrera;

    }

    //Getter and Setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //heredamos el metodo mostrar información, sobreescritura de metodos
    @Override//indica que vamos a sobreescribir un metodo
    public void mostrarInformacion() {
        //super.getNombre() indica que vamos a trear solo un nombre
        super.mostrarInformacion();//traemos el codigo dentro de mostrar detalles
        System.out.println("Matricula: " + this.matricula);//agregamos más comportamientos al metodo mostrar detalles
        System.out.println("Carrera: " + this.carrera);
    }

}

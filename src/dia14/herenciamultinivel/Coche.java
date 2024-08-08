package dia14.herenciamultinivel;
//subclase que deriva de vehiculo

public class Coche extends Vehiculo {

    private int numeroPuertas;

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("numero de puertas: " + this.numeroPuertas);
    }
}

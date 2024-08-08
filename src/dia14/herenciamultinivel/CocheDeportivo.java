package dia14.herenciamultinivel;
//subclase que deriva de coche
public class CocheDeportivo extends Coche {

    private int velocidadMaxima;

    //trae todos los atributos de la super clase Vehiculo como de la subclase Coche
    public CocheDeportivo(String marca, String modelo, int numeroPuertas, int velocidadMaxima) {
        super(marca, modelo, numeroPuertas);
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("velocidad: " + this.velocidadMaxima);
    }
}


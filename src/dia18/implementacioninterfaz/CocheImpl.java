package dia18.implementacioninterfaz;

//implementamos la interfaz
public class CocheImpl implements Vehiculo {//Impl significa que se esta implementando una interfaz

    //Atributo
    private int velocidad;

    //Implementación de métodos de la interfaz
    @Override
    public void arrancar() {
        System.out.println("El coche ha arrancado");
    }

    @Override
    public void detener() {
        System.out.println("El coche se ha detenido");
    }

    @Override
    public void acelerar(int incremento) {
        this.velocidad += incremento;
        System.out.println("El coche ha acelerado: " + this.velocidad + " km/h.");
    }
}

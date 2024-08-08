package dia19.implementacionmultiple;

public interface Portatil {

    void encender();
    void apagar();

    default  void  cargar() {
        System.out.println(" Cargando dispositivo...");
    }
}

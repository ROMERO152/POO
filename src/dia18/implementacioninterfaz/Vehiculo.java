package dia18.implementacioninterfaz;

public interface Vehiculo {

    //Cualquier clase que implemente una interfaz debe usar los métodos de la interfaz
    //Método abstracto
    void arrancar();

    void detener();

    void acelerar(int incremento);
}

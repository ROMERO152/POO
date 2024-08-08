package dia19.implementacionmultiple;

public interface DispositivoInteligente {

    void conectarInternet();
    void desconectarInternet();

    default  void actualizarSoftware() {
        System.out.println(" Actualizando software");
    }
}

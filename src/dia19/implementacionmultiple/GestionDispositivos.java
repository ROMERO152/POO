package dia19.implementacionmultiple;

public class GestionDispositivos {
    public static void main(String[] args) {

        TelefonoInteligenteImpl telefonoInteligente = new TelefonoInteligenteImpl("Samsung", "S53");

        telefonoInteligente.encender();
        telefonoInteligente.conectarInternet();
        telefonoInteligente.actualizarSoftware();
        telefonoInteligente.cargar();
        telefonoInteligente.desconectarInternet();
        telefonoInteligente.apagar();

    }
}

package dia19.gestionpagos;

public class CriptoMonedaImpl implements  MetodoPago{

    //Atributos
    private String direccionBilletera;

    //Constructor
    public CriptoMonedaImpl(String direccionBilletera) {
        this.direccionBilletera = direccionBilletera;
    }

    //implementacion de metodos abstractos
    @Override
    public void procesarPago(double monto) {
        System.out.println("procesando pago con criptomonedas " + monto);
    }

    @Override
    public String obtenerDetallesPago() {
        return "criptomonedas dirección billetera: " + this.direccionBilletera;
    }
}

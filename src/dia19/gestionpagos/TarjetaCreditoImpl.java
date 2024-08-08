package dia19.gestionpagos;

public class TarjetaCreditoImpl implements MetodoPago{

    //Atributos
    private String numeroTarjeta;
    private String nombreTitular;

    public TarjetaCreditoImpl(String numeroTarjeta, String nombreTitular) {
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
    }

    //Getter and Setter
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    //Implementar métodos abstractos de la interfaz
    @Override
    public void procesarPago(double monto) {
        System.out.println(
                "Procesano pago con tarjeta de crédito  de $ " + monto + " para " + this.nombreTitular);
    }

    @Override
    public String obtenerDetallesPago() {
        return "Tarjeta de crédito - titular: " + this.nombreTitular + "Numero: " + this.numeroTarjeta;
    }


}

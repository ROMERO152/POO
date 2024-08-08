package dia19.gestionpagos;

public class PayPalImpl implements MetodoPago{

    //Atributos
    private String email;
    private String contrasenia;

    //Constructor
    public PayPalImpl(String email, String contrasenia) {
        this.email = email;
        this.contrasenia = contrasenia;
    }

    //Getter and Setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("procesando pago con PayPal de $" + monto + " para " + this.email);
    }

    @Override
    public String obtenerDetallesPago() {
        return "Paypal - email " + email;
    }
}

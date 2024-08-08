package dia19.gestionpagos;

public class ProcesadorPago {

    public void prosesarPago( MetodoPago metodoPago, double  monto) {//usamos metodo pago como tipo de dato que es el nombre de la interfaz
        metodoPago.procesarPago(monto);
        System.out.println("-detalles del pago: " + metodoPago.obtenerDetallesPago());
    }
}

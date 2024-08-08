package dia19.gestionpagos;

public class GestionPagos {
    public static void main(String[] args) {

        //APLICAMOS POLIMORFISMO
        MetodoPago tarjetaCredito = new TarjetaCreditoImpl("1234-5678-9456-2542", "juan");

        MetodoPago payPal = new PayPalImpl("juam@hot", "123456");

        MetodoPago cripto = new CriptoMonedaImpl("hjhhjDDDD12");

        tarjetaCredito.procesarPago(2000);
        tarjetaCredito.obtenerDetallesPago();

        payPal.procesarPago(2255);
        payPal.obtenerDetallesPago();

        cripto.procesarPago(2555);
        cripto.obtenerDetallesPago();

        ProcesadorPago procesador = new ProcesadorPago();

        procesador.prosesarPago(tarjetaCredito, 1235);
        System.out.println();
        procesador.prosesarPago(payPal,23656);
        System.out.println();
        procesador.prosesarPago(cripto, 4552);
    }

}

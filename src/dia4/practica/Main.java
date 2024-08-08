package dia4.practica;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto();
        Producto producto2 = new Producto("galletas");
        Producto producto3 = new Producto("sabritas",55);
        Producto producto4 = new Producto("pan",558, "panaderia");
        Producto producto5 = new Producto("coca-cola", 5566, "bebidas", 20.0);

        //imprimir detalles de productos
        System.out.println();
        producto1.imprimirDetalles();
        producto2.imprimirDetalles();
        producto3.imprimirDetalles();
        producto4.imprimirDetalles();
        producto5.imprimirDetalles();

        //aplicar impuesto
        System.out.println();
        System.out.println(
                "El precio del producto: " + producto5.getNombre()
                        + " con impuestos es de: $" + producto5.calcularPrecioConImpuestos(10));

        //aplicar descuento
        System.out.println();
        producto5.aplicarDescuento(10);
        System.out.println("El producto" + producto5.getNombre() + " Con descuento es de " + producto5.getPrecio());

    }
}

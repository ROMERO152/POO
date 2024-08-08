package practicapersonal;

public class MainProducto {
    public static void main(String[] args) {

        //objetos(instancias de la clase
        Producto producto1 = new Producto("jabon",55.2,5);
        Producto producto2 = new Producto("tablet",26,5);
        Producto producto = Producto.crearProducto("smarphone",566);

        System.out.println("nombre: " + producto1.getNombre() + " precio: " + producto1.getPrecio());
        System.out.println("Nombre: " + producto2.getNombre() + " Precio: " + producto2.getPrecio());

        //valor total
        System.out.println("Valor Total: " + producto1.getNombre() + " " + producto1.calcularValorTotal());
        System.out.println("valor total: " + producto2.getNombre() + " " + producto2.calcularValorTotal());

        //aplicar descuento
        Producto.aplicarDescuentoGlobal(10);
        System.out.println(producto1.getNombre() + " Precio con descuento: " + producto1.calcularValorTotal());
        System.out.println(producto2.getNombre() + " precio con descuento: " + producto2.calcularValorTotal());

        //incrementar cantidad
        producto1.incrementarCantidad(8);
        System.out.println("cantidad despues de incrementar: " + producto1.getCantidad() + producto1.calcularValorTotal());


    }
}

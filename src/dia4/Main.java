package dia4;

public class Main {
    public static void main(String[] args) {

        //creamos objetos con argumentos
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado("Eliseo Romero");
        Empleado empleado3 = new Empleado("Mario lopez", 125);
        Empleado empleado4 = new Empleado("Luis Torres", 456, "desarrollador");
        Empleado empleado5 = new Empleado("Carlos Robles", 985, "gerente", 2500.0);

        //imprimir detalles del empleado
        empleado1.imprimirDetalles();
        empleado2.imprimirDetalles();
        empleado3.imprimirDetalles();
        empleado4.imprimirDetalles();
        empleado5.imprimirDetalles();

        System.out.println(
                "Salario anual de: " + empleado5.getNombre() + ": " + empleado5.calcularSalarioAnual());

        empleado5.aplicarAumento(10);
        System.out.println(
                "Nuevo salario mensual de " + empleado5.getNombre() + ": " + empleado5.getSalarioMensual());
    }
}

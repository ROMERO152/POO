package dia6.practica;

public class Banco {

    //Atributos estáticos, le pertenece directamente a la clase (al banco); y puede ser utilizado directamente desde la clase
    private static double tasaInteres = 3.5;
    //Atributos
    private String nombreCliente;
    private double saldo;

    //Constructor
    public Banco(String nombreCliente, double saldo){
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    //Método estático
    public static void cambiarTasaInteres(double nuevaTasa){//no se puede usar this dentro del metodo estatico
        tasaInteres = nuevaTasa;//ya no es necesario el this yaque le pertenece a la clase
    }

    //metodo de comportamiento
    public void mostrarDetalles(){
        System.out.println("Cliente: " + this.nombreCliente);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Tasa de interes: " + tasaInteres);
    }
}

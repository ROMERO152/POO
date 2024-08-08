package dia3.practica;

public class MainCuentas {
    public  static void  main(String[]args){

        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria("juan lopez");
        CuentaBancaria cuenta3 = new CuentaBancaria("ana",500.00);

        //Detalles de cada cuenta
        System.out.println("Cuenta 1: Titular: " + cuenta1.getTitular() + ", Balance: " + cuenta1.getBalance());
        System.out.println("Cuenta 2: Titular: " + cuenta2.getTitular() + ", Balance: " + cuenta2.getBalance());
        System.out.println("Cuenta 3: Titular: " + cuenta3.getTitular() + ", Balance: " + cuenta3.getBalance());

        //operaciones en las cuentas
        cuenta2.depositar(500.0);//deposito
        cuenta3.retirar(200.0);//retiro

        //detalles de las cuentas despues de las operaciones
        System.out.println("");
        System.out.println("Despues de las operaciones: ");
        System.out.println("Cuenta 2: Titular: " + cuenta2.getTitular() + ", Balance: " + cuenta2.getBalance());
        System.out.println("Cuenta 3: Titular: " + cuenta3.getTitular() + ", Balance: " + cuenta3.getBalance());
    }
}

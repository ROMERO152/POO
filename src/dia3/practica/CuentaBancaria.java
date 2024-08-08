package dia3.practica;

public class CuentaBancaria {

    //Atributos
    private String titular;
    private double balance;

    //Constructores
    public CuentaBancaria(){
        this("desconocido", 0.0);
    }


    public CuentaBancaria(String titular){
        this(titular, 0.0);
    }


    public  CuentaBancaria(String titular, double balance){
        this.titular = titular;
        this.balance = balance;
    }

    //Getters and Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Métodos de comportamiento
    public  void depositar(double monto){
        if (monto > 0){//el monto siempre debe ser mayor a 0
            this.balance += monto;//le sumamos el monto al balance
        }
    }

    public  boolean retirar(double monto){
        if (monto > 0 && monto <= this.balance ){
            this.balance -= monto;
            return  true;//finaliza el ciclo del método y ya no deja que se ejecute otra linea de código
        }
        return  false;
    }
}

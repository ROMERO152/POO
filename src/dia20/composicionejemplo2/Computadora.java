package dia20.composicionejemplo2;


//Composición - Relación tiene-un
public class Computadora {

    private Procesador procesador; //Composición
    private  Memoria memoria;

    public Computadora(Procesador procesador, Memoria memoria) {
        this.procesador = procesador;
        this.memoria = memoria;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public  void  mostrarDetalles(){
        System.out.println("Procesador: " + this.procesador.getModelo() + ", Memoria: " + this.memoria.getCapacidad() + " GB");
    }
}

package dia19.implementacionmultiple;

//Implementamos la interfaz
public class TelefonoInteligenteImpl implements Portatil, DispositivoInteligente {

    //Atributos
    public String marca;
    private String modelo;

    //Constructor
    public TelefonoInteligenteImpl(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Getter and Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //implementación de métodos abstractos
    @Override
    public void encender() {
        System.out.println(this.marca + " " + this.modelo + " esta encendido");
    }

    @Override
    public void apagar() {
        System.out.println(this.marca + " " + this.modelo + " esta apagado");
    }

    @Override
    public void conectarInternet() {
        System.out.println(this.marca + " " + this.modelo + " conectado a Internet");
    }

    @Override
    public void desconectarInternet() {
        System.out.println(this.marca + " " + this.modelo + " desconectado de Internet");
    }


    //Métodos de comportamiento
}

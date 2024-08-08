package dia14.herenciamultinivel;
//super clase(clase base o clase padre)
public class Vehiculo {

    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

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

    public void mostrarInformacion(){
        System.out.println("marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);

    }
}

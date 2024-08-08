package dia15.gestionvehiculos;

public class Motocicleta extends Vehiculo{

    //Atributo adicional
    private boolean tieneCasco;

    //Sobrecarga de constructores

    public Motocicleta() {
        this("desconocida", "desconocida", 0, false);
    }

    public Motocicleta(String marca, String modelo, int anio) {
        this(marca, modelo, anio,false);
    }

    public Motocicleta(String marca, String modelo, int anio, boolean tieneCasco) {
        super(marca, modelo, anio);
        this.tieneCasco = tieneCasco;
    }

    //Getter and Setter
    public boolean isTieneCasco() {
        return tieneCasco;
    }

    public void setTieneCasco(boolean tieneCasco) {
        this.tieneCasco = tieneCasco;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tiene casco: "  + (this.tieneCasco ? "Si" : "No"));//Operador ternario, si es verdadero se ejecuta el si en caso contrario no
        /*if (this.tieneCasco == true){
            System.out.println("Sí");
        }else{
            System.out.println("No");
        }
        */
    }

    //Sobre escritura de métodos
    //Metodo realizar mantenimiento
    @Override
    public void realizarMantenimiento() {
        System.out.println("La motocicleta está en mantenimiento. verificar neumaticos ");
    }
}

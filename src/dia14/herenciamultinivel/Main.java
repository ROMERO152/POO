package dia14.herenciamultinivel;

public class Main {
    public static void main(String[] args) {

        CocheDeportivo cocheDeportivo= new CocheDeportivo("mustang","2024", 6,254);


        //vamos heredando atributos de una clase a otra y al final se imprimen todas en uno solo
        //Se utiliza solo en diseño orientado a objetos
        cocheDeportivo.mostrarInformacion();
    }
}

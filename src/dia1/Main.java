package dia1;

public class Main {
    public static void main(String[] args) {
        //crear un objeto tiene que llamarse como la clase
        //new quiere decir que vamos a crear un espacio en memoria e inicializa nuestro constructor
        //le damos valores a las variables de la clase automovil
        //los valores dentro del parentesis se les llama argumentos ya que enviamos datos
        //a la clase automovil para darle valor a los parametros
        Automovil auto1 = new Automovil("toyota", "corolla", 2020, 2000.0);
        //un objeto es una instancia de clases,
        //una instancia de clase es una conexion entre clases

        //creamos otro objeto llamado auto2
        // los valores dentro del parentesis son argumentos que enviamos al constructor
        Automovil auto2 = new Automovil("honda", "civic", 2024, 1254.5);


        //mostrar detalles
        auto1.mostrarDetalles();//mandamos llamar el metodo mostrar detalles
        System.out.println("");
        auto2.mostrarDetalles();
        System.out.println("-------");


        //IMPLEMENTANDO LOS METODOS GETTER Y SETTER

        //VER PRECIO DEL PRIMER AUTO
        System.out.println(auto1.getPrecio());
        //modificar precio de auto1
        auto1.setPrecio(35000.0);
        System.out.println(auto1.getPrecio());

    }
}

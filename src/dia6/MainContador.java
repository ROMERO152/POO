package dia6;

public class MainContador {
    public static void main(String[] args) {


        //Contador.contador = 23; //llamamos al contador y le damos un valor
        //objetos, hay 3 instancias de clase
        //los objetos comparten el mismo atributo estatico
        Contador obj1 = new Contador();
        Contador obj2 = new Contador();
        Contador obj3 = new Contador();
        Contador obj4 = new Contador();

        obj1.mostrarContador();

    }
}

package dia16;

public class Main {
    public static void main(String[] args) {

        //no se pueden hacer objetos de una clase abstracta en este caso de animal
        //por lo cual aplicamos poliformismo aplicando un comportamiento de otra clase
        Animal perro = new Perro("Max ", 2);//clase animal con comportamiento de perro
        Animal gato = new Gato("pelusa", 2);

        perro.hacerSonido();
        perro.dormir();
        System.out.println(" ");
        gato.hacerSonido();
        gato.dormir();
        String javaHome = System.getProperty("java.home");
        System.out.println(javaHome);

    }
}

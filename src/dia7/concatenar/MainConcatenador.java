package dia7.concatenar;

public class MainConcatenador {
    public static void main(String[] args) {

        Concatenador concatenador = new Concatenador();

        String texto = concatenador.concatenar("Hola", "", "mundo");
        System.out.println(texto);

        texto = concatenador.concatenar("Hola", " ", "Mundo", " ", "java");
        System.out.println(texto);
    }
}

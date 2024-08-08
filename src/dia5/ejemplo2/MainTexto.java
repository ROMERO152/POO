package dia5.ejemplo2;

public class MainTexto {
    public static void main(String[] args) {

        Texto texto = new Texto();

        String textoconvertido = texto.convertirAMayusculas("carlos garcia");
        System.out.println(textoconvertido);

        textoconvertido += "-";
        System.out.println(textoconvertido);
    }
}

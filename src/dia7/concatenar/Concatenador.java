package dia7.concatenar;

public class Concatenador {

    //metodo varargs
    public String concatenar(String... cadenas){

        //al usar stringbuilder siempre es necesario crearle un objeto
        StringBuilder resultado = new StringBuilder();

        for (String cadena : cadenas){
            resultado.append(cadena); //el append funciona como el += concatena
        }
        return resultado.toString();//convierte el stringbuilder a cadenas de texto
    }
}

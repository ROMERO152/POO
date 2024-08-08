package dia18.estructurainterfaz;

public interface NombreInterfaz {//Se puede convertir a clase cambiando interface por clase
    //No son interfaces gráficas

    //Creamos nuestros métodos, esto no es tan común ya que solo debe tener métodos
    int CONSTANTE = 10;
    //public final static int NUM_UNO = 0; por defecto se generan de esta forma los atributos, EN MAYÚSCULAS Y CON UN GUION BAJO
    //las constantes en java una vez que se les asigna un valor no pueden ser modificadas
    //las interfaces deben seguir el principio solid los cinco principios, cada interfaz debe tener un solo atributo y metodo

    //Metodo abstracto
    public void metodoAbstracto();

    //Métodos con comportamiento dentro de una interfaz(sin implementación)

    //Método estático
    public static void metodoEstatico() {//por defecto se genera de tipo public por lo cual no es necesario colocarlo
        System.out.println("Este es un metodo estático."); //Le pertenece exclusivamente a la interfaz
    }

    //Método por default
    public default double metodoDefault() {
        System.out.println("Esto es un metodo por default");//Queda libre de uso no le pertenece a la interfaz

        return 0;
    }

    //una interfaz nunca debe de estar dentro de una interfaz sino dentro de una clase



}

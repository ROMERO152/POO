package dia3;

public class Main {
    public  static  void  main(String[]args){

        Persona persona1 = new Persona();//sin argumentos
        Persona persona2 = new Persona("Carlos");//un argumento
        Persona persona3 = new Persona("Juan", 23);//dos argumentos
        Persona persona4 = new Persona(5);

        System.out.println("persona 1: Nombre: " + persona1.getNombre() + ", Edad: " + persona1.getEdad());
        System.out.println("persona 2: Nombre: " + persona2.getNombre() + ", Edad: " + persona2.getEdad());
        System.out.println("persona 3: Nombre: " + persona3.getNombre() + ", Edad: " + persona3.getEdad());
        System.out.println("persona 4: Nombre: " + persona4.getNombre() + ", Edad: " + persona4.getEdad());
    }
}

package dia14.polimorfismodinamico;
//Clase derivada de empleado

public class Gerente  extends  Empleado{

    @Override
    public void trabajar(){
        System.out.println("El gerente esta trabajando en la gestión del equipo. ");
    }
}

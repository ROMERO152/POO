package dia14.polimorfismodinamico;

public class Empresa {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        //El empleado se convierte en gerente cambiandole su constructor y no el objeto de la clase
        //clase empleado y comportamiento de gerente
        //solo se aplica para la super clase, es la que puede adoptar el comportamiento de sus hijas
        //un desarrollador no puede tener el comportamiento de la super clase Empleado
        //El empleado si puede tener comportamientos de gerente, desarrollador todas las subclases
        Empleado empleado3 = new Gerente();//le cambiamos el comportamiento con el contructor del gerente
        //clase empleado y comportamiento de gerente

        empleado1.trabajar();
        empleado2.trabajar();
        empleado3.trabajar();
    }
}

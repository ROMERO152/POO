package dia17.practica;
//Superclase

 abstract public class FiguraGeometrica {

     //Método abstracto
     abstract public double calcularArea();

     //Método concreto mostrar detalles
     public void mostrarDetalles(){
         System.out.println("El área del " + getClass().getSimpleName() + " es: " + this.calcularArea() + " Cm^2\n");
     }

}

package dia5;

public class MainCirculo {
    public static void main(String[] args) {

        //objeto
        Circulo circulo = new Circulo();
        double areaCirculo = circulo.calcularAreaCirculo(5.0);//guardamos el parametro en una variable
        double areaTotal = areaCirculo * 5;
        System.out.println(areaTotal);

        circulo.calcularAreaCirculo(8);
        areaCirculo = circulo.calcularAreaCirculo(8);
        areaTotal = areaCirculo * 7;
        System.out.println(areaTotal);

        //System.out.println(circulo.calcularAreaCirculo(5.0));
    }
}

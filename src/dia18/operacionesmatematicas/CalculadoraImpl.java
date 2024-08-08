package dia18.operacionesmatematicas;

public class CalculadoraImpl implements OperacionesMatematicas{
    @Override
    public int sumar(int a, int b) {
        return a + b;
    }

    @Override
    public int restar(int a, int b) {
        return a - b;
    }
}

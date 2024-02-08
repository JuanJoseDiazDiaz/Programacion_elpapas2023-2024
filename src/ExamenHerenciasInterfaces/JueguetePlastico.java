package ExamenHerenciasInterfaces;

public abstract class JueguetePlastico extends Jueguete{
    private TPlastico tPlastico;

    public JueguetePlastico(String marca, String nombre, double precio, TPlastico pvc) throws JuegueteException {
        super(marca, nombre, precio);
    }

    public TPlastico gettPlastico() {
        return tPlastico;
    }

}

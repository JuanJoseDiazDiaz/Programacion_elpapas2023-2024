package ExamenHerenciasInterfaces;

public class VehiculoPlastico extends JueguetePlastico{
    private int numRuedas;

    public VehiculoPlastico(String marca, String nombre, double precio,int numRuedas) throws JuegueteException {
        super(marca, nombre, precio, TPlastico.PVC);
        setNumRuedas(numRuedas);
    }

    public void setNumRuedas(int numRuedas) throws JuegueteException {
        if (numRuedas < 1 ){
            throw new JuegueteException("Error, Ruedas insufuciente");
        }
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }
}

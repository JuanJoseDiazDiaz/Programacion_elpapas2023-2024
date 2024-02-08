package ExamenHerenciasInterfaces;

public class InstrumentoMadera extends JugueteMadera{
    private int edadMin;
    public InstrumentoMadera(String marca, String nombre, double precio, String paisOrigen, int year, int edadMin) throws JuegueteException {
        super(marca, nombre, precio, paisOrigen, year);
        setEdadMin(edadMin);
    }
    public int getEdadMin() {
        return edadMin;
    }

    private void setEdadMin(int edadMin) throws JuegueteException {
        if (edadMin < 1){
            throw new JuegueteException("valor por debajo, para la edad");
        }
        this.edadMin = edadMin;
    }


}

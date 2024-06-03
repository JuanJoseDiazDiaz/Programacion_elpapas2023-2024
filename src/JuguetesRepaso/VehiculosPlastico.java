package JuguetesRepaso;

public class VehiculosPlastico extends JuguetesPlastico {

    // TODO DEBE SER TIPO PVC
    private int numRuedas;

    public VehiculosPlastico(String nombreJuguete, String marcaJuguete, double precio, TipoPlastico tipoPlastico, int numRuedas) throws ErrorException {
        super(nombreJuguete, marcaJuguete, precio, tipoPlastico);
        this.numRuedas = numRuedas;
        comprobacionTipoPVC(tipoPlastico);
    }

    public int getNumRuedas() {
        return numRuedas;
    }
    public boolean comprobacionTipoPVC(TipoPlastico tipoPlastico) throws ErrorException {
        if (tipoPlastico != TipoPlastico.PVC){
            throw new ErrorException("Lo siento no se puede Crear, no es PVC ");
        }
        return true;
    }

    @Override
    public String toString() {
        return "VehiculosPlastico{"
                +" NombreJuguete= " + getNombreJuguete()
                +" MarcaJuguete= "+ getMarcaJuguete()+
                " tipoPlastico= " + getTipoPlastico() +
                " numRuedas= " + numRuedas +
                '}';
    }
}

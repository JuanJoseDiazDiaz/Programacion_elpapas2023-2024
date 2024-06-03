package JuguetesRepaso;

public class PiezasLego extends JuguetesPlastico implements Apilable{

    // TODO DEBE SER TIPO ABS
    private double longitudPieza;
    private String colorPieza;

    public PiezasLego(String nombreJuguete, String marcaJuguete, double precio, TipoPlastico tipoPlastico, double longitudPieza, String colorPieza) throws ErrorException {
        super(nombreJuguete, marcaJuguete, precio, tipoPlastico);
        this.longitudPieza = longitudPieza;
        this.colorPieza = colorPieza;
        comprobacionTipoABS(tipoPlastico);
    }

    public double getLongitudVehiculo() {
        return longitudPieza;
    }

    public String getColorVehiculo() {
        return colorPieza;
    }

    public boolean isPuedeApilarLego(PiezasLego piezasLego) throws ErrorException {
        if (piezasLego instanceof Apilable) {
            ((Apilable)piezasLego).apilar();
            return true;
        }
        throw new ErrorException("No se puede apilar, son distintos");
    }
    @Override
    public boolean apilar() throws ErrorException {
        if (!this.equals(this)){
            throw new ErrorException("No se puede apilar, son distintas");
        }
        return true;
    }
    public boolean comprobacionTipoABS(TipoPlastico tipoPlastico) throws ErrorException {
        if (tipoPlastico != TipoPlastico.ABS){
            throw new ErrorException("Lo siento no se puede Crear, no es ABS ");
        }
        return true;
    }

    @Override
    public String toString() {
        return "PiezasLego{"
                +" NombreJuguete= " + getNombreJuguete()
                +" MarcaJuguete= "+ getMarcaJuguete()+
                " tipoPlastico= " + getTipoPlastico() +
                " longitudPieza= " + longitudPieza +
                " , colorPieza= " + colorPieza  +
                " }";
    }
}

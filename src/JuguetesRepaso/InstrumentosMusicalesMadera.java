package JuguetesRepaso;

public class InstrumentosMusicalesMadera extends JuguetesMadera {
    private int edadInstrumento;

    public InstrumentosMusicalesMadera(String nombreJuguete, String marcaJuguete, double precio, PaisOrigenMadera paisOrigenMadera, int anioTala, int edadInstrumento) throws ErrorException {
        super(nombreJuguete, marcaJuguete,precio, paisOrigenMadera, anioTala);
        this.edadInstrumento = edadInstrumento;
    }

    public int getEdadInstrumento() {
        return edadInstrumento;
    }

    @Override
    public String toString() {
        return "JuguetesMadera{"
                + " NombreJuguete= " + getNombreJuguete()
                + " MarcaJueguete= "+ getMarcaJuguete()+
                " paisOrigenMadera= " + getPaisOrigenMadera() +
                ", anioTala= " + getAnioTala()
                + " edadInstrumento "+ edadInstrumento+
                '}';
    }
}

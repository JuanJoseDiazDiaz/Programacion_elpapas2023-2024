package JuguetesRepaso;

public class JuguetesMadera extends Juguete {
    private static final int anioActual = 2024;
    private PaisOrigenMadera paisOrigenMadera;
    private int anioTala;



    public JuguetesMadera(String nombreJuguete, String marcaJuguete, double precio, PaisOrigenMadera paisOrigenMadera, int anioTala) throws ErrorException {
        super(nombreJuguete, marcaJuguete, precio);
        this.paisOrigenMadera = paisOrigenMadera;
        setAnioTala(anioTala);

    }

    public PaisOrigenMadera getPaisOrigenMadera() {
        return paisOrigenMadera;
    }

    public int getAnioTala() {
        return anioTala;
    }

    public void setAnioTala(int anioTala) throws ErrorException {
        if (anioTala > anioActual){
            throw new ErrorException("Error, valor no valido");
        }
        this.anioTala = anioTala;
    }

    @Override
    public String toString() {
        return "JuguetesMadera{"
                + " NombreJuguete= " + getNombreJuguete()
                + " MarcaJueguete= "+ getMarcaJuguete()+
                " paisOrigenMadera= " + paisOrigenMadera +
                ", anioTala= " + anioTala +
                '}';
    }
}

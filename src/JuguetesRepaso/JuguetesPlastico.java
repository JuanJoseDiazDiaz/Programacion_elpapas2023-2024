package JuguetesRepaso;

public class JuguetesPlastico extends Juguete{
    private TipoPlastico tipoPlastico;

    public JuguetesPlastico(String nombreJuguete, String marcaJuguete, double precio, TipoPlastico tipoPlastico) {
        super(nombreJuguete, marcaJuguete, precio);
        this.tipoPlastico = tipoPlastico;
    }

    public TipoPlastico getTipoPlastico() {
        return tipoPlastico;
    }

    public void setTipoPlastico(TipoPlastico tipoPlastico) {
        this.tipoPlastico = tipoPlastico;
    }

    @Override
    public String toString() {
        return "JuguetesPlastico{"
                +" NombreJuguete= " + getNombreJuguete()
                +" MarcaJuguete= "+ getMarcaJuguete()+
                " tipoPlastico= " + tipoPlastico +
                '}';
    }
}

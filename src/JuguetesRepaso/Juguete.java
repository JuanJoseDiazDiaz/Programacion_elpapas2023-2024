package JuguetesRepaso;

public class Juguete {
    private String nombreJuguete;
    private String marcaJuguete;

    private double precioJuguete;

    public Juguete(String nombreJuguete, String marcaJuguete,double precioJuguete) {
        this.nombreJuguete = nombreJuguete;
        this.marcaJuguete = marcaJuguete;
        this.precioJuguete = precioJuguete;
    }

    public String getNombreJuguete() {
        return nombreJuguete;
    }

    public void setNombreJuguete(String nombreJuguete) {
        this.nombreJuguete = nombreJuguete;
    }

    public String getMarcaJuguete() {
        return marcaJuguete;
    }

    public void setMarcaJuguete(String marcaJuguete) {
        this.marcaJuguete = marcaJuguete;
    }

    public double getPrecioJuguete() {
        return precioJuguete;
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "nombreJuguete='" + nombreJuguete + '\'' +
                ", marcaJuguete='" + marcaJuguete + '\'' +
                '}';
    }
}

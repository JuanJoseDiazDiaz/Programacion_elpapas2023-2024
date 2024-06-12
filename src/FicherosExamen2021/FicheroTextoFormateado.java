package FicherosExamen2021;

import java.time.LocalDateTime;

public class FicheroTextoFormateado extends FicheroTexto implements Analizable{
    private TipoDeFuentes tipoDeFuentes;

    private double tamanioFuente;

    private ColorFuente colorFuente;

    public FicheroTextoFormateado(String nombre, Byte tamanio, LocalDateTime fechaCreacion, String[][] matriz, TipoDeFuentes tipoDeFuentes, double tamanioFuente, ColorFuente colorFuente) {
        super(nombre, tamanio, fechaCreacion, matriz);
        this.tipoDeFuentes = tipoDeFuentes;
        this.tamanioFuente = tamanioFuente;
        this.colorFuente = colorFuente;
    }

    public TipoDeFuentes getTipoDeFuentes() {
        return tipoDeFuentes;
    }

    public double getTamanioFuente() {
        return tamanioFuente;
    }

    public ColorFuente getColorFuente() {
        return colorFuente;
    }

    @Override
    public String toString() {
        return super.toString() +
                "FicheroTextoFormateado{" +
                "tipoDeFuentes=" + tipoDeFuentes +
                ", tamanioFuente=" + tamanioFuente +
                ", colorFuente=" + colorFuente +
                '}';
    }

    @Override
    public void analizable(FicheroTextoFormateado ficheroTextoFormateado) throws FicheroException {
        if (!(ficheroTextoFormateado instanceof Analizable)){
            throw new FicheroException("Error, no es analizable");
        }
        System.out.println("analizando el fichero" + getNombre());
    }

    @Override
    public void analizable(FicheroEjecutable ficheroEjecutable) throws FicheroException {

    }
}

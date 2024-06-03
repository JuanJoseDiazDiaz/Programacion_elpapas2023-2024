package JuguetesRepaso;

import java.util.ArrayList;
import java.util.List;

public class FigurasDeMadera extends JuguetesMadera implements Apilable{
    private ColorFigura colorFigura;
    private int numLados;


    public FigurasDeMadera(String nombreJuguete, String marcaJuguete, PaisOrigenMadera paisOrigenMadera, double precio, int anioTala, ColorFigura colorFigura, int numLados) throws ErrorException {
        super(nombreJuguete, marcaJuguete, precio, paisOrigenMadera, anioTala);
        this.colorFigura = colorFigura;
        this.numLados = numLados;
    }

    public ColorFigura getColorFigura() {
        return colorFigura;
    }

    public int getNumLados() {
        return numLados;
    }

    public boolean isPuedeApilarse(JuguetesMadera juguetesMadera) throws ErrorException {
        if (juguetesMadera instanceof Apilable){
            ((Apilable) juguetesMadera).apilar();
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

    @Override
    public String toString() {
        return "FigurasDeMadera{"
                + " NombreJuguete= " + getNombreJuguete()
                + " MarcaJueguete= "+ getMarcaJuguete()+
                " paisOrigenMadera= " + getPaisOrigenMadera() +
                ", anioTala= " + getAnioTala()  +
                " colorFigura= " + colorFigura +
                ", numLados= " + numLados +
                '}';
    }
}

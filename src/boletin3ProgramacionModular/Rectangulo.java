package boletin3ProgramacionModular;

public class Rectangulo {
    private double longitud;
    private double ancho;

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public Rectangulo (){
        longitud = 1;
        ancho = 1;

    }
}

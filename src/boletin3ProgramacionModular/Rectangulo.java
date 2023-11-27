package boletin3ProgramacionModular;

public class Rectangulo {
    public static final double MAX_LONG_ANCHO = 20;
    private double longitud;
    private double ancho;

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(5, 2);
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        if (longitud > 0 && longitud < MAX_LONG_ANCHO){
            this.longitud = longitud;
        } else {
            // TODO SE LE GENERA UNA EXCEPCION
        }

    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho > 0 && ancho < MAX_LONG_ANCHO  ){
            this.ancho = ancho;
        } else {
            // TODO SE LE GENERA UNA EXCEPCION
        }

    }

    public Rectangulo (int l, int a){
        setAncho(a);
       setLongitud(l);

    }
}

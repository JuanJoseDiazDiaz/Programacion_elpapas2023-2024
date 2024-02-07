package Ejercicios_Interfaces;

import java.time.LocalDate;

public class FicheroFormateado extends Fichero {
    private String tipoFuente;
    private int tamanoFuente;
    private String colorFuente;

    public FicheroFormateado(String nombre, byte tamano, LocalDate fecha, String tipoFuente, int tamanoFuente, String colorFuente) {
        super(nombre, tamano, fecha);
        this.tipoFuente = tipoFuente;
        this.tamanoFuente = tamanoFuente;
        this.colorFuente = colorFuente;
    }
    @Override
    public byte getTamano() {
        return super.getTamano();
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

package Ejercicios_Interfaces;

import java.time.LocalDate;

public class Fichero {
    private String nombre;
    private byte tamano;
    private LocalDate fecha;

    public Fichero(String nombre, byte tamano, LocalDate fecha) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getTamano() {
        return tamano;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Fichero{" +
                "nombre='" + nombre + '\'' +
                ", tamano=" + tamano +
                ", fecha=" + fecha +
                '}';
    }
}

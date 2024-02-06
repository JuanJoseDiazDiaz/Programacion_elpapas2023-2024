package Ejercicios_Interfaces;

import java.time.LocalDate;

public class Fichero {
    private String nombre;
    private int tamano;
    private LocalDate fecha;

    public Fichero(String nombre, int tamano, LocalDate fecha) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}

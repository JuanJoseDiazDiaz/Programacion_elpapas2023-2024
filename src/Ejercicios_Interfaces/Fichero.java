package Ejercicios_Interfaces;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Fichero{
    private String nombre;

    private LocalDateTime fecha;

    public Fichero(String nombre) {
        this.nombre = nombre;
        this.fecha = LocalDateTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public long getSize() {
        return 0;
    }


    public LocalDateTime getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Fichero{" +
                "nombre='" + nombre +
                ", fecha=" + fecha +
                '}';
    }


}

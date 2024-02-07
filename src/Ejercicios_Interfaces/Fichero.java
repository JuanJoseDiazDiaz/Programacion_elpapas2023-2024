package Ejercicios_Interfaces;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Fichero {
    private String nombre;
    private long size;
    private LocalDateTime fecha;

    public Fichero(String nombre, byte tamano, LocalDateTime fecha) {
        this.nombre = nombre;
        setSize(size);
        this.fecha = LocalDateTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        if (size < 1) throw new IllegalArgumentException("El tamaño no puede ser un valor negativo");
        this.size = size;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Fichero{" +
                "nombre='" + nombre + '\'' +
                ", tamano=" + size +
                ", fecha=" + fecha +
                '}';
    }
}

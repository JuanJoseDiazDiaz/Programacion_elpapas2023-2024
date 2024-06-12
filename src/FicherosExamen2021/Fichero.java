package FicherosExamen2021;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Fichero {
    private String nombre;
    private Byte tamanio;

    private LocalDateTime fechaCreacion;


    public Fichero(String nombre, Byte tamanio, LocalDateTime fechaCreacion) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.fechaCreacion = LocalDateTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public Byte getTamanio() {
        return tamanio;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public String toString() {
        return "Fichero{" +
                "nombre='" + nombre + '\'' +
                ", tamanio=" + tamanio +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}

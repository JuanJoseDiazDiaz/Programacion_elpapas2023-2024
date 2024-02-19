package Boletin6_Listas;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private String Dni;

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        Dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(Dni, alumno.Dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, Dni);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", Dni='" + Dni + '\'' +
                '}';
    }
}

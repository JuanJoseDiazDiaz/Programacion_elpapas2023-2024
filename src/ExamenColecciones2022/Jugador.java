package ExamenColecciones2022;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Jugador {
    private String nombre;
    private TPosicionJugador demarcacion;
    private LocalDate fechaNacimiento;
    private String paisNacimiento;
    private Period period;
    private LocalDate fechaActual;
    private int edad;

    
    public Jugador(String nombre, TPosicionJugador demarcacion, LocalDate fechaNacimiento, String paisNacimiento) {
        super();
        this.nombre = nombre;
        this.demarcacion = demarcacion;
        this.fechaNacimiento = fechaNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.fechaActual = LocalDate.now();
        this.period = Period.between(fechaNacimiento, fechaActual);
        this.edad = period.getYears();
    }

    public String getNombre() {
        return nombre;
    }


    public TPosicionJugador getDemarcacion() {
        return demarcacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(nombre).append(": ");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        sb.append(fechaNacimiento.format(formatter)).append(". ")
            .append(demarcacion).append(" (").append(paisNacimiento).append(")");
        
        return sb.toString();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(nombre, jugador.nombre) && demarcacion == jugador.demarcacion && Objects.equals(fechaNacimiento, jugador.fechaNacimiento) && Objects.equals(paisNacimiento, jugador.paisNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, demarcacion, fechaNacimiento, paisNacimiento);
    }
}

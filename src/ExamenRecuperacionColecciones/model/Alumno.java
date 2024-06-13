package ExamenRecuperacionColecciones.model;


import ExamenRecuperacionColecciones.exceptions.CursoException;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;


public class Alumno {
    private String nombre;
    private String dni;
    private LocalDate fechaNacimiento;
    private boolean esRepetidor;
    private List<LocalDate> faltasAsistencia;
    private Map<Materia, Double> materiasMatriculadas;
    private Period period;
    private LocalDate fechaActual;
    private int edad;

    public Alumno(String nombre, String dni, LocalDate fechaNacimiento, boolean esRepetidor) throws CursoException {
        if (nombre == null || nombre.isEmpty()) {
            throw new CursoException("El nombre del alumno no puede estar vacío.");
        }
        if (dni == null || dni.isEmpty()) {
            throw new CursoException("El DNI del alumno no puede estar vacío.");
        }
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.esRepetidor = esRepetidor;
        this.faltasAsistencia = new ArrayList<>();
        this.materiasMatriculadas = new HashMap<>();
        this.fechaActual = LocalDate.now();
        this.period = Period.between(fechaNacimiento, fechaActual);
        this.edad = period.getYears();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public boolean isRepetidor() {
        return esRepetidor;
    }

    public List<LocalDate> getFaltasAsistencia() {
        return faltasAsistencia;
    }

    public Map<Materia, Double> getMateriasMatriculadas() {
        return materiasMatriculadas;
    }

    public int getEdad() {
        return edad;
    }

    public void agregarFalta(LocalDate fecha) {
        if (fecha.isBefore(LocalDate.of(2023, 9, 15))) {
            throw new IllegalArgumentException("La fecha de la falta no puede ser anterior al 15 de septiembre de 2023.");
        }
        if (fecha.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de la falta no puede ser futura.");
        }
        faltasAsistencia.add(fecha);
    }

    public void matricularMateria(Materia materia) {
        materiasMatriculadas.put(materia, null);
    }

    public void setNota(Materia materia, double nota) {
        if (!materiasMatriculadas.containsKey(materia)) {
            throw new IllegalArgumentException("El alumno no está matriculado en esta materia.");
        }
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 10.");
        }
        materiasMatriculadas.put(materia, nota);
    }

    public int getNumeroMateriasSuspensas() {
        int count = 0;
        for (Double nota : materiasMatriculadas.values()) {
            if (nota != null && nota < 5) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(dni, alumno.dni) && Objects.equals(fechaNacimiento, alumno.fechaNacimiento.isAfter(LocalDate.now()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni, fechaNacimiento);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", esRepetidor=" + esRepetidor +
                ", faltasAsistencia=" + faltasAsistencia +
                ", notas=" + materiasMatriculadas +
                '}';
    }
}

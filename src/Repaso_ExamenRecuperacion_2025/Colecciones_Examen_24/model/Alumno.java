package Repaso_ExamenRecuperacion_2025.Colecciones_Examen_24.model;


import Repaso_ExamenRecuperacion_2025.Colecciones_Examen_24.exceptions.CursoException;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Alumno {

    private String nombre;
    private String dni;
    private LocalDate fechaNacimiento;
    private boolean repetidor;
    private Set<LocalDate> faltasAsistencia;
    private Map<Materia, Double> materiasMatriculadas;

    public Alumno(String nombre, String dni, LocalDate fechaNacimiento, boolean repetidor) throws CursoException {
        setNombre(nombre);
        setDni(dni);
        setFechaNacimiento(fechaNacimiento);
        this.repetidor = repetidor;
        this.faltasAsistencia = new HashSet<>();
        this.materiasMatriculadas = new HashMap<>();
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
        return repetidor;
    }

    public Set<LocalDate> getFaltasAsistencia() {
        return faltasAsistencia;
    }

    public Map<Materia, Double> getMateriasMatriculadas() {
        return materiasMatriculadas;
    }

    private void setFechaNacimiento(LocalDate fechaNacimiento) throws CursoException {
        if (LocalDate.of(2000, 01, 01).isBefore(fechaNacimiento) || LocalDate.now().isBefore(fechaNacimiento)) {
            throw new CursoException("La fecha de nacimiento es invalida");
        }
    }

    public void matricularMateria(Materia materia) throws CursoException {

    }

    public void setNota(Materia materia, double calificacion) throws CursoException {
        if (calificacion < 0f || calificacion > 10f) {
            throw new CursoException("Error, la nota esta fuera de las puntaciones");
        }
        materiasMatriculadas.put(materia, calificacion);
    }

    public void agregarFalta(LocalDate fecha) throws CursoException {
        if (LocalDate.of(2023, 9, 15).isAfter(fecha) || LocalDate.now().isBefore(fecha)) {
            throw new CursoException("La fecha de nacimiento es invalida");
        }
    }

    public void setNombre(String nombre) throws CursoException {
        if (nombre == null) {
            throw new CursoException("Error, el alumno tiene que tener nombre obligatorio");
        }
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        if (dni.equals(dni)){
            System.out.println("Error, el alumno tiene el mismo dni");
        }

        if (dni == null) {
            System.out.println("Error, el dni esta vacío");
        }
        this.dni = dni;
    }

    public int getEdad() {
        int edad = fechaNacimiento.getYear() - LocalDate.now().getYear();
        return edad;
    }
}

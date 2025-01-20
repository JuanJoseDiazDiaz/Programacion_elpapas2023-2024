package Repaso_ExamenRecuperacion_2025.Colecciones_Examen_24.model;


import Repaso_ExamenRecuperacion_2025.Colecciones_Examen_24.exceptions.CursoException;

import java.time.LocalDate;
import java.util.*;

public class Curso {
    private String nombre;
    private Set<Alumno> alumnos;
    private Set<Materia> materias;

    public Curso(String nombre) throws CursoException {
        setNombre(nombre);
        this.alumnos = new HashSet<>();
        this.materias = new HashSet<>();
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public void agregarMateria(Materia materia) {
        this.materias.add(materia);
    }

    public Set<Alumno> getAlumnos() {
        return this.alumnos;
    }

    public Set<Materia> getMaterias() {
        return this.materias;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) throws CursoException {
        if (nombre == null || nombre.isEmpty()) {
            throw new CursoException("El nombre no puede estar vacio");
        }
        this.nombre = nombre;
    }

    public void matricularAlumno(Alumno alumno, Materia materiaOptativa) throws CursoException {
        if (materias.isEmpty() || materias.contains(alumno)) {
            throw new CursoException("Error, al matricular el alumno");
        }else{
            agregarAlumno(alumno);
        }

        if (!alumnos.contains(materiaOptativa)){
            throw new CursoException("Error, al matricular tiene 0 materias optativa eliga alguna");
        }else{
            agregarMateria(materiaOptativa);
        }
    }


    public void asignarNota(Alumno alumno, Materia materia, double calificacion) throws CursoException {
        alumno.setNota(materia, calificacion); // Esto añadira una nota nueva al alumno
    }

    public Map<Alumno, Integer> getAlumnosConNumeroSuspensos() {
        Map<Alumno, Integer> alumnoSupenso = new HashMap<>();
       return (Map<Alumno, Integer>) alumnoSupenso.entrySet().stream().filter(notaAlumno -> notaAlumno.getValue() < 5);
    }

    public double mediaEdad() {
        return alumnos.stream()
                .mapToInt(Alumno::getEdad) // Convierte cada alumno a su edad (entero)
                .average() // Calcula el promedio
                .orElse(0.0); //
    }

    public double notaMaximaRepetidores (Materia materia) {
        return alumnos.stream()
                .filter(Alumno::isRepetidor) // Filtra alumnos repetidores
                .mapToDouble(alumno -> alumno.getMateriasMatriculadas().getOrDefault(materia, 0.0)) // Obtiene la nota de la materia
                .max() // Encuentra la nota máxima
                .orElse(0.0); // Si no hay notas, devuelve 0.0
    }


    public void eliminarAlumno (Alumno alumno) {
        this.alumnos.remove(alumno);
    }

    public void addFaltaDeAsistencia(Alumno alumno, LocalDate fecha) throws CursoException {
        alumno.agregarFalta(fecha);
    }

//    public Map<Alumno, Integer> getFaltasDeAsistenciaUltimos15Dias() {
//
//    }

}

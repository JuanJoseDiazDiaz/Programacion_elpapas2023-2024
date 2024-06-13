package ExamenRecuperacionColecciones.model;


import ExamenRecuperacionColecciones.exceptions.CursoException;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class Curso {
    private String nombre;
    private Set<Alumno> alumnos;
    private Set<Materia> materias;
    private Map<Alumno, Integer> alumnoIntegerMap;


    public Curso(String nombre) throws CursoException {
        setNombre(nombre);
        this.alumnos = new HashSet<>();
        this.materias = new HashSet<>();
        this.alumnoIntegerMap = new HashMap<>();
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
        this.nombre = nombre;

    }

    public void matricularAlumno(Alumno alumno, Materia materiaOptativa) throws CursoException {
        if (!alumnos.contains(alumno)) {
            throw new CursoException("No se puede matricular porque no existe");
        }
        alumno.matricularMateria(materiaOptativa);
    }


    public void asignarNota(Alumno alumno, Materia materia, double calificacion) throws CursoException {
        alumno.setNota(materia, calificacion);
    }


    public double mediaEdad() throws CursoException {
        return alumnos.stream().mapToDouble(Alumno::getEdad).average().orElseThrow(() -> new CursoException("No hay alumnos"));
    }


    public double notaMaximaRepetidores(Materia materia) throws CursoException {
        return alumnos.stream().filter(Alumno::isRepetidor).flatMap(alumno -> alumno.getMateriasMatriculadas().values().stream()).mapToDouble(Double::doubleValue).max().orElseThrow(() -> new CursoException("Error, valor no valido"));
    }

    public void eliminarAlumno(Alumno alumno) {
        this.alumnos.remove(alumno);
    }

    public void addFaltaDeAsistencia(Alumno alumno, LocalDate fecha) throws CursoException {
        alumno.agregarFalta(fecha);
    }

    public Map<Alumno, Integer> getFaltasDeAsistenciaUltimos15Dias() {
       LocalDate hoy = LocalDate.now();
        LocalDate hace15Dias = hoy.minusDays(15);
        Map<Alumno, Integer> faltasPorAlumno = new HashMap<>();

        for (Alumno alumno : alumnos) {
            int conteoFaltas = 0;
            for (LocalDate falta : alumno.getFaltasAsistencia()) {
                if (!falta.isBefore(hace15Dias) && !falta.isAfter(hoy)) {
                    conteoFaltas++;
                }
            }
            faltasPorAlumno.put(alumno, conteoFaltas);
        }

        return faltasPorAlumno;



    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(nombre, curso.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public Map<Alumno, Integer> getAlumnosConNumeroSuspensos() {
        Map<Alumno, Integer> alumnosConSuspensos = new HashMap<>();
        for (Alumno alumno : alumnos) {
            alumnosConSuspensos.put(alumno, alumno.getNumeroMateriasSuspensas());
        }
        return alumnosConSuspensos;
    }

}


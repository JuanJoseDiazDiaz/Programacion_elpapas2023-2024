package Boletin6_Listas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Equipo {
    private String nombre;
    private Set<Alumno> alumnos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.alumnos = new HashSet<>();
    }
    public void addAlumno(Alumno alumno) throws AlumnoException{
        if (alumnos.add(alumno) == false){
            throw new AlumnoException("El alumno ya existe en este equipo");
        }
    }
    public void removeAlumno(Alumno alumno)throws AlumnoException{
        if (alumnos.remove(alumno)== false){
            throw new AlumnoException("El alumno no estaba en el equipo");
        }
    }
    public Alumno comprobacionEquipo(Alumno alumno) throws AlumnoException{
        if (alumnos.contains(alumno)){
            return alumno;
        }else{
            return null;
        }
    }
}

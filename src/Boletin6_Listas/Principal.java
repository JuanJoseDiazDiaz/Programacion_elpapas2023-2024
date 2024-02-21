package Boletin6_Listas;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Valenica");
        Equipo equipo2 = new Equipo("Villareal");

        for (int i = 0; i < 10; i++){
            try {
                equipo1.addAlumno(generarAlumno());
            }catch (AlumnoException j ){
                System.out.println("Alumno repetido: "+ equipo1.getAlumnos());
            }
            try {
                equipo2.addAlumno(generarAlumno());
            }catch (AlumnoException e){
                System.out.println("Alumno repetido: "+ equipo2.getAlumnos());
            }
        }
        System.out.println("Equipo 1: ");
        mostrarConjuntoPersonas(equipo1.getAlumnos());
        System.out.println("Equipo 2: ");
        mostrarConjuntoPersonas(equipo2.getAlumnos());
        System.out.println("Equipo U: ");
        Equipo equipoU = equipo1.unionEquipos(equipo1);
        mostrarConjuntoPersonas(equipoU.getAlumnos());
        System.out.println("Equipo I: ");
        Equipo equipoI = equipo2.interseccionEquipos(equipo2);
        mostrarConjuntoPersonas(equipoI.getAlumnos());

    }
    public static void mostrarConjuntoPersonas(Set<Alumno> alumnos){
        Iterator<Alumno> iterator = alumnos.iterator();
        while (iterator.hasNext()){
            Alumno alu = iterator.next();
            System.out.println(alu);
        }
    }
    public static Alumno generarAlumno(){
        Random r = new Random();
        String nombre;
        nombre = " "+r.nextInt(7);
        return new Alumno(nombre, nombre);
    }
}

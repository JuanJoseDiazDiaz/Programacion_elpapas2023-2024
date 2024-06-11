package EjerciciosRepasoColecciones.GestionEstudiante;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class SistemaEstudiante {
    private HashMap<Integer, Estudiante> estudianteHashMap;

    public SistemaEstudiante() {
        this.estudianteHashMap = new HashMap<>();
    }

    public void addEstudiante(Estudiante estudiante) throws SistemaAlumadoException {
        if (estudianteHashMap.containsKey(estudiante)){
            throw new SistemaAlumadoException("No se puede añadir a un estudiante que esta");
        }
        estudianteHashMap.values().add(estudiante);
    }

    public void asignarNotaAlumno(int idEstudiante, int nota) throws SistemaAlumadoException {
        if (!estudianteHashMap.containsKey(idEstudiante)){
            throw new SistemaAlumadoException("No existe el alumno");
        }
        estudianteHashMap.get(idEstudiante).getListaNotas().add(nota);
    }

    public double mediaEstudiante()  {
        double numTotalEstudiante = estudianteHashMap.size();
        double sumatotalEstudiante = estudianteHashMap.values().stream().mapToDouble(Estudiante::getNota).sum();
        return sumatotalEstudiante / numTotalEstudiante;
    }

    public void estudianteList()  {
        for (Estudiante estudiante : estudianteHashMap.values()){
            System.out.println(estudiante +" su promedio es de: "+ mediaEstudiante());
        }
    }

    public HashMap<Integer, Estudiante> getEstudianteHashMap() {
        return estudianteHashMap;
    }

    public void setEstudianteHashMap(HashMap<Integer, Estudiante> estudianteHashMap) {
        this.estudianteHashMap = estudianteHashMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SistemaEstudiante that = (SistemaEstudiante) o;
        return Objects.equals(estudianteHashMap, that.estudianteHashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estudianteHashMap);
    }
}

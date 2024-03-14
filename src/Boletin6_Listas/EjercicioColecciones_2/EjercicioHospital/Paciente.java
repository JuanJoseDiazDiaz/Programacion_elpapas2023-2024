package boletinRepasoExamen.Avion.EjerciciosRepaso.EjercicioHospital;
import java.util.LinkedList;
import java.util.Set;

public class Paciente implements  Comparable<Paciente>{
    private static final int PRIORIDAD_MAX= 1;
    private static final int PRIORIDAD_MIN= 5;

    private int dniPaciente;
    private String nombrePaciente;
    private int edadPaciente;
    private int prioridadPaciente;
    private int ordenDeLLegada;

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public int getDniPaciente() {
        return dniPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public int getOrdenDeLLegada() {
        return ordenDeLLegada;
    }

    public Paciente(int dniPaciente, String nombrePaciente, int edadPaciente, int prioridadPaciente, int ordenDeLLegada) throws HospitalException {
        this.dniPaciente = dniPaciente;
        this.nombrePaciente = nombrePaciente;
        this.edadPaciente = edadPaciente;
        setPrioridadPaciente(prioridadPaciente);
        this.ordenDeLLegada = ordenDeLLegada;
    }

    public void setPrioridadPaciente(int prioridadPaciente) throws HospitalException{
        if (prioridadPaciente < PRIORIDAD_MAX || prioridadPaciente > PRIORIDAD_MIN){
            throw new HospitalException("valor inncorrecto");
        }
        this.prioridadPaciente = prioridadPaciente;
    }

    public int getPrioridadPaciente() {
        return prioridadPaciente;
    }

    @Override
    public int compareTo(Paciente otroPaciente) {
        if (prioridadPaciente - otroPaciente.prioridadPaciente == 0){
            return ordenDeLLegada - otroPaciente.ordenDeLLegada;
        }
        return prioridadPaciente - otroPaciente.prioridadPaciente;

    }

    @Override
    public String toString() {
        return "Paciente{" +
                "dniPaciente=" + dniPaciente +
                ", nombrePaciente='" + nombrePaciente + '\'' +
                ", edadPaciente=" + edadPaciente +
                ", prioridadPaciente=" + prioridadPaciente +
                ", ordenDeLLegada=" + ordenDeLLegada +
                '}';
    }
}
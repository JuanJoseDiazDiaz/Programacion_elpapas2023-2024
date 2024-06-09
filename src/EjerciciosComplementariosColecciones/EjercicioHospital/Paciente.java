package EjerciciosComplementariosColecciones.EjercicioHospital;

public class Paciente {
    private int dni;
    private String nombrePaciente;
    private int edad;
    private int prioridadPaciente;
    private int horaDeLlegada;



    public Paciente(int dni, String nombrePaciente, int edad, int prioridadPaciente, int horaDeLlegada) throws ProblemaPacienteException {
        this.dni = dni;
        this.nombrePaciente = nombrePaciente;
        this.edad = edad;
        setPrioridadPaciente(prioridadPaciente);
        this.horaDeLlegada = horaDeLlegada;
    }

    public void setPrioridadPaciente(int prioridadPaciente) throws ProblemaPacienteException {
        if (prioridadPaciente < 0 || prioridadPaciente > 5) {
            throw new ProblemaPacienteException("Error, valor no valido");
        }
        this.prioridadPaciente = prioridadPaciente;
    }

    public int getDni() {
        return dni;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public int getEdad() {
        return edad;
    }

    public int getPrioridadPaciente() {
        return prioridadPaciente;
    }

    public int getHoraDeLlegada() {
        return horaDeLlegada;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "dni=" + dni +
                ", nombrePaciente='" + nombrePaciente + '\'' +
                ", edad=" + edad +
                ", prioridadPaciente=" + prioridadPaciente +
                ", horaDeLlegada=" + horaDeLlegada +
                '}';
    }
}

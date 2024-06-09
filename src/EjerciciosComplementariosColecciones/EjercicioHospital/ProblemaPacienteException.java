package EjerciciosComplementariosColecciones.EjercicioHospital;

public class ProblemaPacienteException extends Exception {
    public ProblemaPacienteException(String s) {
    }

    public ProblemaPacienteException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProblemaPacienteException(Throwable cause) {
        super(cause);
    }
}

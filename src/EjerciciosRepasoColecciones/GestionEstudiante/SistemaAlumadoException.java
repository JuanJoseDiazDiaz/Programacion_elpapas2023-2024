package EjerciciosRepasoColecciones.GestionEstudiante;

public class SistemaAlumadoException extends Exception {
    public SistemaAlumadoException(String message) {
        super(message);
    }

    public SistemaAlumadoException(String message, Throwable cause) {
        super(message, cause);
    }

    public SistemaAlumadoException(Throwable cause) {
        super(cause);
    }
}

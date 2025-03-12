package RepasoDeFicheros2025.PosibleExamen.Excepciones;

public class PosibleExamenErrorException extends Exception {
    public PosibleExamenErrorException(String message) {
        super(message);
    }

    public PosibleExamenErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public PosibleExamenErrorException(Throwable cause) {
        super(cause);
    }
}

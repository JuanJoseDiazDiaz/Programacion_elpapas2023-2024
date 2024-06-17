package RecuperacionFicheros2024;

public class ErrorExamenException extends Exception {

    public ErrorExamenException(String message) {
        super(message);
    }

    public ErrorExamenException(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorExamenException(Throwable cause) {
        super(cause);
    }
}

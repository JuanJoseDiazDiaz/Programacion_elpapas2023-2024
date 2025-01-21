package Repaso_ExamenRecuperacion_2025.Herencias.expections;

public class JuegoRolException extends Exception {
    public JuegoRolException(String message, Throwable cause) {
        super(message, cause);
    }

    public JuegoRolException(String message) {
        super(message);
    }
}

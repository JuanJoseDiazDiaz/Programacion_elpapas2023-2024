package Repaso_ExamenRecuperacion_2025.Ej1;

public class CuentaExpection extends Exception{
    public CuentaExpection(String message) {
        super(message);
    }

    public CuentaExpection(String message, Throwable cause) {
        super(message, cause);
    }
}

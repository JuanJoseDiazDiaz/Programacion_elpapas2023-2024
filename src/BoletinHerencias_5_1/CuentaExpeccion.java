package BoletinHerencias_5_1;

public class CuentaExpeccion extends Exception{
    public CuentaExpeccion(String message) {
        super(message);
    }

    public CuentaExpeccion(Throwable cause) {
        super(cause);
    }

    public CuentaExpeccion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

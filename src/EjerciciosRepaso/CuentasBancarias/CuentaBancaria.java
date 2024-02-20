package EjerciciosRepaso.CuentasBancarias;

import java.time.LocalDateTime;

public interface CuentaBancaria {

    public void obtenerDatosCuenta(int numCuenta, double saldo, LocalDateTime fechaApertura);

    public void playGame();
}

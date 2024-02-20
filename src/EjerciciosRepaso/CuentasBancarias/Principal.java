package EjerciciosRepaso.CuentasBancarias;

import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        cuentaBancariaBase cuentaBancariaBase = new cuentaBancariaBase(1234341, 3424, LocalDateTime.now());
        CuentaBancariaDeAhorro cuentaAhorro = new CuentaBancariaDeAhorro(34121252, 1000, LocalDateTime.now(), 50);

        CuentaBancaria[] cuentaBancarias ={cuentaBancariaBase, cuentaAhorro};
        EmpiezaPrograma(cuentaBancarias);
    }
    public static void EmpiezaPrograma(CuentaBancaria [] cuentaBancarias){
        for (CuentaBancaria c : cuentaBancarias){
            c.playGame();
        }
    }
}

package BoletinHerencias_5_1;

public class CuentaCredito extends Cuenta{
    public static final double CREDITO_ACTUAL = 100;
    public static final double CREDITO_MAX = 300;
    private double creditoActual;

    public CuentaCredito(double saldoActual, double creditoActual) throws CuentaCreditoExpection {
        super(saldoActual);
        setCreditoActual(creditoActual);
    }
    public CuentaCredito (double creditoActual) throws CuentaCreditoExpection {
       setCreditoActual(creditoActual);
    }
    public CuentaCredito (){
        this.creditoActual = CREDITO_ACTUAL;
    }


    public double getCreditoActual() {
        return creditoActual;
    }

    public void setCreditoActual(double creditoActual) throws CuentaCreditoExpection {
        if (creditoActual > CREDITO_MAX){
            throw new CuentaCreditoExpection("te has pasado del credito maximo");
        } else if (creditoActual < 0) {
            throw new CuentaCreditoExpection("el credito es negativo, no es valido");
        }
        this.creditoActual = creditoActual;
    }

    @Override
    public void ingresarDinero(double dineroIngresado) throws CuentaCreditoExpection {

    }

    @Override
    public void retirarDinero(double dineroSacado) throws CuentaCreditoExpection {
       if (creditoActual >= getSaldoActual() + getCreditoActual()){
           throw new CuentaCreditoExpection("Has llegado al limite del credito");
       }
       if (dineroSacado < getSaldoActual() && dineroSacado < getCreditoActual()){
           super.retirarDinero(dineroSacado);
       }else{
           dineroSacado -= getSaldoActual();
           super.retirarDinero(getSaldoActual());
       }
    }
}

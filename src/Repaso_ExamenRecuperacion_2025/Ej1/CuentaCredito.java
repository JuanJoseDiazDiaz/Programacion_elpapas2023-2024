package Repaso_ExamenRecuperacion_2025.Ej1;

import BoletinHerencias_5_1.CuentaCreditoExpection;

public class CuentaCredito extends CuentaCliente{
    public static final double CREDITO_ACTUAL = 100;
    public static final double CREDITO_MAX = 300;
    private double creditoLimite = CREDITO_MAX;
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
    public void ingresarDinero(double dineroIngresado) throws CuentaExpection {
        if (creditoActual < creditoLimite){
            double diferenciaCredito = creditoActual - creditoLimite;
            if (diferenciaCredito <= dineroIngresado){
                dineroIngresado -= diferenciaCredito;
                creditoActual = creditoLimite;
            }else {
                creditoActual += dineroIngresado;
                dineroIngresado = 0;
            }
            if (dineroIngresado > 0){
                super.ingresarDinero(dineroIngresado);
            }
        }
    }

    @Override
    public void retirarDinero(double dineroSacado){
      if (creditoActual < creditoLimite){
          double diferenciaCredito = creditoActual - creditoLimite;
          if (diferenciaCredito <= dineroSacado){
              dineroSacado -= diferenciaCredito;
              creditoActual = creditoLimite;
          }
      }
    }
}

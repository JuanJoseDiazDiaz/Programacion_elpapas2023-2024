package Juan_Jose_Diaz_ExamenObjetosRecuperacion;

import java.util.List;

public class Coche {
    private String marca;
    private String modelo;

    private ColoresCoche coloresCoche;
    private Motor motor;
    private Bateria bateria;
    private DepositoGasolina depositoGasolina;
    private CajaCambios cajaCambios;


    public Coche(String marca, String modelo, ColoresCoche coloresCoche, Motor motor, Bateria bateria, DepositoGasolina depositoGasolina, CajaCambios cajaCambios) {
        this.marca = marca;
        this.modelo = modelo;
        this.coloresCoche = coloresCoche;
        this.motor = motor;
        this.bateria = bateria;
        this.depositoGasolina = depositoGasolina;
        this.cajaCambios = cajaCambios;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean arrancarCoche() {
        if (motor.nivelAceiteCorrecto()) {
            if (bateria.capacidadArrancar()) {
                if (motor.nivelAguaCorrecto()) {
                    if (motor.nivelTemperaturaCorrecto()) {
                        if (depositoGasolina.hayCombustible() && depositoGasolina.isPresionCorrecta()) {
                            if (bateria.capacidadVoltajeCorrecta()){
                                if (cajaCambios.isEstadoCajaCambios()){
                                    System.out.println("El coche ha arrancado");
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("El coche no puede arrancar");
        return false;
    }


    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", coloresCoche=" + coloresCoche;
    }
}

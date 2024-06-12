package ExamenRecuperacionHerencias;

import java.util.IllegalFormatCodePointException;

public abstract class Sensor {
    private String marca;
    private String modelo;
    private int identificador;
    private boolean activo;
    private double temperaturaSensor;

    public Sensor(String marca, String modelo, int identificador, boolean activo, double temperaturaSensor) {
        this.marca = marca;
        this.modelo = modelo;
        this.identificador = identificador;
        this.activo = activo;
        this.temperaturaSensor = temperaturaSensor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getIdentificador() {
        return identificador;
    }

    public boolean isActivo() {
        if (!activo){
            System.out.println("No esta activo");
        }
        return activo;
    }



    public double getTemperaturaSensor() {
        return Double.parseDouble("hace una temperatura de "+ temperaturaSensor);
    }
}

package ExamenRecuperacionHerencias;

public class SensorHumedad extends Sensor implements Autochequeables{
    private double humedadRelativa;
    private double humedadAbsoluta;

    private boolean estadoSensorHumedad;

    public SensorHumedad(String marca, String modelo, int identificador, boolean activo, double temperaturaSensor, double humedadRelativa, double humedadAbsoluta, boolean estadoSensorHumedad) throws ProblemaSensor {
        super(marca, modelo, identificador, activo, temperaturaSensor);
        setHumedadRelativa(humedadRelativa);
        setHumedadAbsoluta(humedadAbsoluta);
        estadoSensor(estadoSensorHumedad);
    }

    public double getHumedadRelativa() {
        return humedadRelativa;
    }

    public void setHumedadRelativa(double humedadRelativa) throws ProblemaSensor {
        if (humedadRelativa < 0 || humedadRelativa > 1){
            throw new ProblemaSensor("Error, valor no valido");
        }
        this.humedadRelativa = humedadRelativa;
    }

    public double getHumedadAbsoluta() {
        return humedadAbsoluta;
    }

    public void setHumedadAbsoluta(double humedadAbsoluta) throws ProblemaSensor {
        if (humedadAbsoluta < 0 || humedadAbsoluta > 1){
            throw new ProblemaSensor("Error, valor no valido");
        }
        this.humedadAbsoluta = humedadAbsoluta;
    }

    @Override
    public double getTemperaturaSensor() {
        return super.getTemperaturaSensor();
    }

    @Override
    public boolean estadoSensor(boolean estadoSensor) {
        if (!estadoSensor){
            System.out.println("Defectuoso");
        }else {
            System.out.println("Correcto");
        }
        return false;
    }
}

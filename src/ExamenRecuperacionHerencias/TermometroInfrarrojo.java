package ExamenRecuperacionHerencias;

public class TermometroInfrarrojo extends SensorTemperatura implements Autochequeables{
    private boolean estadoSensorInfrarrojos;
    public TermometroInfrarrojo(String marca, String modelo, int identificador, boolean activo, double temperaturaSensor, double temperaturaCelsius, boolean estadoSensorInfrarrojos) throws ProblemaSensor {
        super(marca, modelo, identificador, activo, temperaturaSensor, temperaturaCelsius, estadoSensorInfrarrojos);
        estadoSensor(estadoSensorInfrarrojos);
        this.estadoSensorInfrarrojos = estadoSensorInfrarrojos;

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

    public boolean isEstadoSensorInfrarrojos() {
        return estadoSensorInfrarrojos;
    }

    public boolean isActivo(){
        if (!isEstadoSensorInfrarrojos()){
            System.out.println("No esta bien");
        }
        return true;
    }
}

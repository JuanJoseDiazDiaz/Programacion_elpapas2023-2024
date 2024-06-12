package ExamenRecuperacionHerencias;

public class SensorTemperatura extends Sensor{

    private static final double TEMPERATURA_MIN_CELSIUS = 0;
    private static final double TEMPERATURA_MAX_CELSIUS = 100;

    private double temperaturaCelsius;
    private boolean estado;

    public SensorTemperatura(String marca, String modelo, int identificador, boolean activo, double temperaturaSensor, double temperaturaCelsius, boolean estadoSensorTemperatura) throws ProblemaSensor {
        super(marca, modelo, identificador, activo ,temperaturaSensor);
        setTemperaturaCelsius(temperaturaCelsius); // Restringe al usuario a utilizar una temperatura acorde a los valores dados
        this.temperaturaCelsius = temperaturaCelsius;
        this.estado = estadoSensorTemperatura;
    }

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public void setTemperaturaCelsius(double temperaturaCelsius) throws ProblemaSensor {
        if (temperaturaCelsius < TEMPERATURA_MIN_CELSIUS || temperaturaCelsius > TEMPERATURA_MAX_CELSIUS){
            throw new ProblemaSensor("La temperatura introducida no es correcta");
        }
        this.temperaturaCelsius = temperaturaCelsius;
    }


    @Override
    public double getTemperaturaSensor() {
        return super.getTemperaturaSensor();
    }

    public boolean isEstado() {
        return estado;
    }

    public boolean isActivo(){
        if (!isEstado()){
            System.out.println("No esta bien");
        }
        return true;
    }
}

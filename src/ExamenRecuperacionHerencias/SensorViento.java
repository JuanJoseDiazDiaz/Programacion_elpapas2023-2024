package ExamenRecuperacionHerencias;

public class SensorViento extends Sensor implements Autochequeables{

    private DireccionActual direccionActual;

    private double velocidadActual;

    private double rachaMax;

    private boolean estadoSensorViento;

    public SensorViento(String marca, String modelo, int identificador, boolean activo, double temperaturaSensor, DireccionActual direccionActual, double velocidadActual, double rachaMax, boolean estadoSensorViento) throws ProblemaSensor {
        super(marca, modelo, identificador, activo, temperaturaSensor);
        setDireccionActual(direccionActual); // Esto Hara que usuario solo pueda crear esas direcciones concretas
        this.velocidadActual = velocidadActual;
        this.rachaMax = rachaMax;
        estadoSensor(estadoSensorViento);
    }

    public DireccionActual getDireccionActual() {
        return direccionActual;
    }

    public void setDireccionActual(DireccionActual direccionActual) throws ProblemaSensor {
        if (direccionActual != DireccionActual.N) {
            if (direccionActual != DireccionActual.S) {
                if (direccionActual != DireccionActual.E) {
                    if (direccionActual != DireccionActual.O) {
                        throw new ProblemaSensor("Error, esa direcion de viento no existe");
                    }
                }
            }
        }

        this.direccionActual = direccionActual;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {

        this.velocidadActual = velocidadActual;
    }

    public double getRachaMax() {
        return rachaMax;
    }

    public void setRachaMax(double rachaMax) {
        this.rachaMax = rachaMax;
    }



    @Override
    public double getTemperaturaSensor() {
        return super.getTemperaturaSensor();
    }

    @Override
    public boolean estadoSensor(boolean estadoSensorViento) {
        if (!estadoSensorViento){
            System.out.println("Defectuoso");
        }else {
            System.out.println("Correcto");
        }
        return true;
    }

}

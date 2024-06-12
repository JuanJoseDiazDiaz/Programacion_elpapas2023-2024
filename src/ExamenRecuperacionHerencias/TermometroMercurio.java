package ExamenRecuperacionHerencias;

public class TermometroMercurio extends SensorTemperatura{
    private boolean estadoTermometroMercurio;
    public TermometroMercurio(String marca, String modelo, int identificador, boolean activo, double temperaturaSensor, double temperaturaCelsius, boolean estadoTermometroMercurio) throws ProblemaSensor {
        super(marca, modelo, identificador, activo, temperaturaSensor, temperaturaCelsius, estadoTermometroMercurio);
        this.estadoTermometroMercurio = estadoTermometroMercurio;

    }
    @Override
    public double getTemperaturaSensor() {
        return super.getTemperaturaSensor();
    }

    public boolean isEstadoTermometroMercurio() {
        return estadoTermometroMercurio;
    }


    public boolean isActivo(){
        if (!isEstadoTermometroMercurio()){
            System.out.println("No esta bien");
        }
        return true;
    }
}

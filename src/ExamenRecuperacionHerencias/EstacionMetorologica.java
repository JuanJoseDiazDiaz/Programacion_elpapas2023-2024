package ExamenRecuperacionHerencias;

public  class EstacionMetorologica {


    private SensorHumedad sensorHumedad;
    private SensorTemperatura sensorTemperatura;
    private SensorViento sensorViento;
    private TermometroInfrarrojo termometroInfrarrojo;
    private TermometroMercurio termometroMercurio;

    public EstacionMetorologica(SensorHumedad sensorHumedad, SensorTemperatura sensorTemperatura, SensorViento sensorViento, TermometroInfrarrojo termometroInfrarrojo, TermometroMercurio termometroMercurio) throws ProblemaSensor {
        this.sensorHumedad = sensorHumedad;
        this.sensorTemperatura = sensorTemperatura;
        this.sensorViento = sensorViento;
        this.termometroInfrarrojo = termometroInfrarrojo;
        this.termometroMercurio = termometroMercurio;
        deteccionDeLLuvia(sensorHumedad, sensorTemperatura,sensorViento);
        chequeoEstacion(sensorHumedad, sensorTemperatura,sensorViento, termometroInfrarrojo, termometroMercurio);
    }

    public boolean deteccionDeLLuvia(SensorHumedad sensorHumedad, SensorTemperatura sensorTemperatura, SensorViento sensorViento){
        if ((sensorViento.getVelocidadActual() > 2.0 && sensorViento.getDireccionActual() == DireccionActual.N) || sensorViento.getVelocidadActual() > 30) {
            if (sensorHumedad.getHumedadRelativa() > 0.70) {
                if (sensorHumedad.getHumedadAbsoluta() > 0.77) {
                    if (sensorTemperatura.getTemperaturaCelsius() < 20) {
                        System.out.println("Va a llover");
                    }
                }
            }
        }
        return false;
    }

    public boolean chequeoEstacion(SensorHumedad sensorHumedad, SensorTemperatura sensorTemperatura, SensorViento sensorViento, TermometroInfrarrojo termometroInfrarrojo, TermometroMercurio termometroMercurio) throws ProblemaSensor {
        if (sensorViento instanceof Autochequeables
                || sensorHumedad instanceof Autochequeables
                || sensorTemperatura instanceof Autochequeables
                || termometroInfrarrojo instanceof Autochequeables
                || termometroMercurio instanceof Autochequeables) { // TODO -> aqui comprobamos si el objeto implementa al objeto
            if (sensorViento.isActivo()) {
                if (sensorHumedad.isActivo()) {
                    if (termometroInfrarrojo.isActivo()) {
                        System.out.println("Esta en Funcionamiento, esta activos los necesarios");
                    }else {
                        if (termometroMercurio.getTemperaturaSensor() > 5){
                            if (termometroMercurio.isActivo()){
                                if (termometroMercurio.isActivo()){
                                    System.out.println("Esta en Funcionamiento, esta activos los necesarios");
                                }

                            }
                            throw new ProblemaSensor("El sensor no da lecturas fiables, por su exceso de temperatura");
                        }
                    }
                }
            }
        }
        return false;
    }

}

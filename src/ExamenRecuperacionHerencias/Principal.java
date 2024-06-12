package ExamenRecuperacionHerencias;

public class Principal {
    public static void main(String[] args) {
        EstacionMetorologica estacionMetorologicaHuelva;
        EstacionMetorologica estacionMetorologicaSevilla;

        {
            try {
                System.out.println("Estacion Meteorologica Huelva: ");
                estacionMetorologicaHuelva = new EstacionMetorologica(new SensorHumedad("dia", "32e", 2, true, 30, 0.80, 0.91, true)
                        , new SensorTemperatura("dia", "32e", 3, true, 30, 13.5, true)
                        , new SensorViento("dia", "32e", 4, true, 30, DireccionActual.N, 5.84d, 100, true)
                        , new TermometroInfrarrojo("dia", "32e", 5, true, 30, 13.5, true)
                        , new TermometroMercurio("dia", "32e", 6, true, 30, 13.5, true)) {
                };

                estacionMetorologicaSevilla = new EstacionMetorologica(new SensorHumedad("dia", "32e", 1, true, 30, 0.71, 0.78, true)
                        , new SensorTemperatura("dia", "32e", 2, true, 30, 10, true)
                        , new SensorViento("dia", "32e", 3, true, 30, DireccionActual.E, 8.4, 100, true)
                        ,new TermometroInfrarrojo("dia", "32e", 4, true, 30, 7, true)
                        , new TermometroMercurio("dia", "32e", 5, true, 30, 13, true));
            } catch (ProblemaSensor e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


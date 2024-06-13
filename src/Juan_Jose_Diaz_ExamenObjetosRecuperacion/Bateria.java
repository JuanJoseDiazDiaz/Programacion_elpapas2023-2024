package Juan_Jose_Diaz_ExamenObjetosRecuperacion;

public class Bateria {
    private static  final double CAPACIDAD_MIN_VOLTAJE = 5;
    private double capacidadBateria;
    private double nivelVoltaje;
    private double cargaActualBateria;

    public Bateria(double capacidadBateria, double nivelVoltaje, double cargaActualBateria) {
        this.capacidadBateria = capacidadBateria;
        this.nivelVoltaje = nivelVoltaje;
        this.cargaActualBateria = cargaActualBateria;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public double getNivelVoltaje() {
        return nivelVoltaje;
    }

    public double getCargaActualBateria() {
        return cargaActualBateria;
    }



    public boolean capacidadArrancar() {
        if (capacidadBateria > CAPACIDAD_MIN_VOLTAJE){
            System.out.println("La bateria tiene mas de la cantidad minima");
            return true;
        }
        return false;
    }
    public boolean capacidadVoltajeCorrecta(){
        if (nivelVoltaje >= 12){
            System.out.println("Nivel de Voltaje perfecto");
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Bateria{" +
                "capacidadBateria=" + capacidadBateria +
                ", nivelVoltaje=" + nivelVoltaje +
                ", cargaActualBateria=" + cargaActualBateria +
                '}';
    }
}

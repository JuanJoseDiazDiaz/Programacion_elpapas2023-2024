package Juan_Jose_Diaz_ExamenObjetosRecuperacion;

import java.nio.file.StandardOpenOption;

public class DepositoGasolina {
    private boolean presionCorrecta;
    private double capacidadLitros;
    private double nivelCombustible;

    public DepositoGasolina(double capacidadLitros, double nivelCombustible, boolean presionCorrecta) {
        this.capacidadLitros = capacidadLitros;
        this.nivelCombustible = nivelCombustible;
        this.presionCorrecta = presionCorrecta;
    }


    public boolean isPresionCorrecta() {
       return presionCorrecta;
    }

    public double getCapacidadLitros() {
        return capacidadLitros;
    }

    public double getNivelCombustible() {
        return nivelCombustible;
    }


    public boolean hayCombustible() {
        if (capacidadLitros <= 0) {
            System.out.println("No hay combustible");
            return false;
        }
        System.out.println("hay combustible");
        return true;
    }

    @Override
    public String toString() {
        return "DepositoGasolina{" +
                "presionCorrecta=" + presionCorrecta +
                ", capacidadLitros=" + capacidadLitros +
                ", nivelCombustible=" + nivelCombustible +
                '}';
    }
}

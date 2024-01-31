package BoletinHerencias_5_1.EmpresaDeVehiculos;

public class Furgoneta extends Vehiculo{
    private static final double PRECIO_KILO = 0.5;
    private  int pma;

    public Furgoneta(String matricula, Gama gama, int pma) {
        super(matricula, gama);
        this.pma = pma;
    }

    @Override
    public double getPrecioDiario() {
        return getGama().getPrecioDia() + pma * PRECIO_KILO;
    }
    private void setPma (int pma) throws VehiculoExpeccion {
        if (pma < 1 ){
            throw new VehiculoExpeccion("PMA invalido");
        }
        this.pma = pma;
    }
}

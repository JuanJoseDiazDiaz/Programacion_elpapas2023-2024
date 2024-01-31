package BoletinHerencias_5_1.EmpresaDeVehiculos;

public class MicroBus extends Vehiculo{
    public static final double PRECIO_PLAZA = 5;
    private int numPlazas;
    public MicroBus(String matricula, Gama gama, int numPlazas) throws VehiculoExpeccion {
        super(matricula, gama);
        setNumPlazas(numPlazas);
    }

    private void setNumPlazas(int numPlazas) throws VehiculoExpeccion {
        if (numPlazas < 1 ){
            throw new VehiculoExpeccion("numero de plazas incorrecto");
        }
        this.numPlazas = numPlazas;
    }

    @Override
    public double getPrecioDiario() {
        return getGama().getPrecioDia() + numPlazas * PRECIO_PLAZA;
    }
}

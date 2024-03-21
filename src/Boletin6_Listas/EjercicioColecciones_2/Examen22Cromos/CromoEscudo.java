package Boletin6_Listas.EjercicioColecciones_2.Examen22Cromos;

public class CromoEscudo extends Cromo{
    private String nombreEquipo;
    private int yearFundacion;
    private int numJugadores;

    public CromoEscudo(String id, String nombreEquipo, int yearFundacion , int numJugadores) {
        super(id);
        this.nombreEquipo =nombreEquipo;
        this.yearFundacion = yearFundacion;
        this.numJugadores = numJugadores;
    }

    @Override
    public String getEquio() {
        return nombreEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public int getYearFundacion() {
        return yearFundacion;
    }

    public int getNumJugadores() {
        return numJugadores;
    }
}

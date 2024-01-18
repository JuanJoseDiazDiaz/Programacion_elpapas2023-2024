package boletinRepasoExamen.Avion.boletin4_1.Ej2;

public class tarjetaGrafica {
    private String marca;
    private String modelo;
    private int numNucleos;
    private float velocidad;
    private int cantMemoria;

    public tarjetaGrafica(String marca, String modelo, int numNucleos, float velocidad, int cantMemoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.numNucleos = numNucleos;
        this.velocidad = velocidad;
        this.cantMemoria = cantMemoria;
    }

    @Override
    public String toString() {
        return "tarjetaGrafica{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numNucleos=" + numNucleos +
                ", velocidad en Ghz=" + velocidad +
                ", cantMemoria en GB=" + cantMemoria +
                '}';
    }
}

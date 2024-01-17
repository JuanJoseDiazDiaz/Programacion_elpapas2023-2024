package boletinRepasoExamen.Avion.boletin4_1.Ej2;

public class microprocesador {
    private String marca;
    private String modelo;
    private int numNucleos;
    private float velocidadBase;
    private String socket;

    public microprocesador(String marca, String modelo, int numNucleos, float velocidadBase, String socket) {
        this.marca = marca;
        this.modelo = modelo;
        this.numNucleos = numNucleos;
        this.velocidadBase = velocidadBase;
        this.socket = socket;
    }

    @Override
    public String toString() {
        return "microprocesador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numNucleos=" + numNucleos +
                ", velocidadBase en GHZ=" + velocidadBase +
                ", socket='" + socket + '\'' +
                '}';
    }
}

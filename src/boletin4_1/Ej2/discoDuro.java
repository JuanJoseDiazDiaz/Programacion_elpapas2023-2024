package boletinRepasoExamen.Avion.boletin4_1.Ej2;

public class discoDuro {
    private String marca;
    private String tipoDeDiscoDuro;
    private int capDisco;

    public discoDuro(String marca, String tipoDeDiscoDuro, int capDisco) {
        this.marca = marca;
        this.tipoDeDiscoDuro = tipoDeDiscoDuro;
        this.capDisco = capDisco;
    }

    @Override
    public String toString() {
        return "discoDuro{" +
                "marca='" + marca + '\'' +
                ", tipoDeDiscoDuro='" + tipoDeDiscoDuro + '\'' +
                ", capDisco en GB=" + capDisco +
                '}';
    }
}

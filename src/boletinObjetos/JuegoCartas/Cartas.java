package boletinObjetos.JuegoCartas;

public class Cartas {
    private String palo;

    private Long numero;

    public Cartas(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}

package Juan_Jose_Diaz_ExamenObjetosRecuperacion;


public class Motor {
    private String marca;
    private String modelo;
    private String numSerie;

    private double nivelAceite;

    private double numKilometros;

    private int nivelAgua;

    private double temperatura;

    public Motor(String marca, String modelo, String numSerie, double nivelAceite, double numKilometros, int nivelAgua, double temperatura) {
        this.marca = marca;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.nivelAceite = nivelAceite;
        this.numKilometros = numKilometros;
        this.nivelAgua = nivelAgua;
        this.temperatura = temperatura;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public double getNivelAceite() {
        return nivelAceite;
    }

    public double getNumKilometros() {
        return numKilometros;
    }

    public int getNivelAgua() {
        return nivelAgua;
    }

    public double getTemperatura() {
        return temperatura;
    }


    public boolean nivelAceiteCorrecto() {
        if (nivelAceite > 96f && nivelAceite < 98f) {
            System.out.println("Nivel Aceite correcto");
            return true;
        }
        return false;
    }

    public boolean nivelAguaCorrecto() {
        if (nivelAgua > 70) {
            System.out.println("Nivel de agua correcto");
            return true;
        }
        return false;
    }

    public boolean nivelTemperaturaCorrecto() {
        if (temperatura > 95) {
            System.out.println("Nivel de temperatura Correcto");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numSerie='" + numSerie + '\'' +
                ", nivelAceite=" + nivelAceite +
                ", numKilometros=" + numKilometros +
                ", nivelAgua=" + nivelAgua +
                ", temperatura=" + temperatura +
                '}';
    }
}

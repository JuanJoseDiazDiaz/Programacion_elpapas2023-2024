package boletinRepasoExamen.Avion.boletin4_1.Ej2;

public class Placa_Base {
    private String marca;
    private String chipset;
    private String socket;

    public Placa_Base(String marca, String chipset, String socket) {
        this.marca = marca;
        this.chipset = chipset;
        this.socket = socket;
    }
    public void compatibilidadPlacaBase (String socket, String socket2){
        if (socket == socket2){
            System.out.println("Es compatible por el propio socket");
        }else {
            System.out.println("No es compatible");
        }
    }

    @Override
    public String toString() {
        return "Placa_Base{" +
                "marca='" + marca + '\'' +
                ", chipset='" + chipset + '\'' +
                ", socket='" + socket + '\'' +
                '}';
    }
}

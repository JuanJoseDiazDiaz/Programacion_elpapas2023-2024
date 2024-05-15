package GestionMascota;

public class Cliente {
    private String nombreCliente;
    private int idCliente;
    private static int cont = 0;

    public Cliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.idCliente = cont++;
    }

}



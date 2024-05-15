package GestionMascota;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombreTienda;
    private List<Mascotas> mascotas;
    private List<Cliente> clientes;
    private List<Compra> compras;

    public Tienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
        this.mascotas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

    public void addCliente(String nombre){
        Cliente cliente = new Cliente(nombre);
        clientes.add(cliente);
    }
}

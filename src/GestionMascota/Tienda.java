package GestionMascota;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Tienda {
    private String nombreTienda;
    private List<Mascotas> listaDeMascotas;
    private List<Cliente> listaDeClientes;
    private List<Compra> listaDeCompras;

    public Tienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
        this.listaDeMascotas = new ArrayList<>();
        this.listaDeClientes = new ArrayList<>();
        this.listaDeCompras = new ArrayList<>();
    }

    public List<Mascotas> getListaDeMascotas() {
        return listaDeMascotas;
    }

    public List<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

    public void addCliente(String nombre) {
        Cliente cliente = new Cliente(nombre);
        listaDeClientes.add(cliente);
    }

    public void addMascota(String nombre, Especie especie, int edad, double precio, boolean disponible) {
        Mascotas mascotas1 = new Mascotas(nombre, especie, edad, precio, disponible);
        listaDeMascotas.add(mascotas1);
    }

    public void comprarMascota(Cliente cliente, Mascotas mascota, LocalDateTime fecha_hora) {
        Compra compra = new Compra(mascota, cliente, fecha_hora);
        listaDeCompras.add(compra);
    }
}

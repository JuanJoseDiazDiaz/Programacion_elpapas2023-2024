package GestionMascota;

import java.time.LocalDateTime;

public class Compra {
    private int idCompra;
    private Mascotas mascota;
    private Cliente cliente;
    private LocalDateTime fecha_hora;

    private static int contCompra = 0;

    public Compra(Mascotas mascota, Cliente cliente, LocalDateTime fecha_hora) {
        this.idCompra = contCompra++;
        this.mascota = mascota;
        this.cliente = cliente;
        this.fecha_hora = LocalDateTime.now();
    }
}

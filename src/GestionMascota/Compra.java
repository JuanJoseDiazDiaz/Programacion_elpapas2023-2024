package GestionMascota;

import java.time.LocalDateTime;

public class Compra {
    private int idCompra;
    private Mascotas mascota;
    private Cliente cliente;
    private LocalDateTime fecha_hora;
    private LocalDateTime fecha_compraDevolucion;

    private static int contCompra = 0;

    public Compra(Mascotas mascota, Cliente cliente) {
        this.idCompra = contCompra++;
        this.mascota = mascota;
        this.cliente = cliente;
        this.fecha_hora = LocalDateTime.now();
    }

    public LocalDateTime getFecha_compraDevolucion() {
        return fecha_compraDevolucion;
    }
}

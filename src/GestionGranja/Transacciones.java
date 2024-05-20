package GestionGranja;

import GestionMascota.Cliente;
import GestionMascota.Mascotas;

import java.time.LocalDateTime;

public class Transacciones {
    private int idTransacciones;
    private Animal animal;
    private ProductosAgricolas productosAgricolas;
    private LocalDateTime fecha_hora;

    public Transacciones(int idTransacciones, Animal animal, ProductosAgricolas productosAgricolas) {
        this.idTransacciones = idTransacciones;
        this.animal = animal;
        this.productosAgricolas = productosAgricolas;
        this.fecha_hora = LocalDateTime.now();
    }

    public int getIdTransacciones() {
        return idTransacciones;
    }

    public Animal getAnimal() {
        return animal;
    }

    public ProductosAgricolas getProductosAgricolas() {
        return productosAgricolas;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }
}

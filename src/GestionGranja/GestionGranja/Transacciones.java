package GestionGranja;


import java.time.LocalDateTime;

public class Transacciones {
    private int idTransacciones;
    private Animal animal;
    private ProductosAgricolas productosAgricolas;
    private LocalDateTime fecha_transaccion;

    public Transacciones(int idTransacciones, Animal animal, ProductosAgricolas productosAgricolas) {
        this.idTransacciones = idTransacciones;
        this.animal = animal;
        this.productosAgricolas = productosAgricolas;
        this.fecha_transaccion = LocalDateTime.now();
    }


}

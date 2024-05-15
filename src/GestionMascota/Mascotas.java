package GestionMascota;

public class Mascotas {
    private String nombreMascota;
    private Especie tipoEspecie;
    private int edad;
    private double precio;
    private boolean disponible;


    public Mascotas(String nombreMascota, Especie tipoEspecie, int edad, double precio) {
        this.nombreMascota = nombreMascota;
        this.tipoEspecie = tipoEspecie;
        this.edad = edad;
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }
}

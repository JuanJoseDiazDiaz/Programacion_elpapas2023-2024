package GestionMascota;

public class Mascotas {
    private String nombreMascota;
    private Especie tipoEspecie;
    private int edad;
    private double precio;
    private boolean disponible;


    public Mascotas(String nombreMascota, Especie tipoEspecie, int edad, double precio, boolean disponible) {
        this.nombreMascota = nombreMascota;
        this.tipoEspecie = tipoEspecie;
        this.edad = edad;
        this.precio = precio;
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

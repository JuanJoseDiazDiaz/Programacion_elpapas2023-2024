package BoletinHerencias_5_1.EmpresaDeVehiculos;

public abstract class Vehiculo {
    private String matricula;
    private double precioBase;
    private Gama gama;

    public Vehiculo(String matricula, Gama gama) {
        this.matricula = matricula;
        this.gama = gama;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getMatricula() {
        return matricula;
    }

    public Gama getGama() {
        return gama;
    }

    public abstract double getPrecioDiario();

    public double getPrecioAlquier(int dias){
        return getPrecioDiario() * dias;
    }
}

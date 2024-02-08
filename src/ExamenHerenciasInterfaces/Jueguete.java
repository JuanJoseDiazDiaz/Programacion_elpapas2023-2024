package ExamenHerenciasInterfaces;

public abstract class Jueguete {
    private String marca;
    private String nombre;
    private double precio;

    public Jueguete(String marca, String nombre, double precio) throws JuegueteException {
        this.marca = marca;
        this.nombre = nombre;
        setPrecio(precio);
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws JuegueteException {
        if (precio <1 ){
            throw new JuegueteException("no puedes dar un precio negativo");
        }
        this.precio = precio;
    }

}

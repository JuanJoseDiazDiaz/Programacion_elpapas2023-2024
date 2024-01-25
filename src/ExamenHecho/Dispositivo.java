package ExamenHecho;

public class Dispositivo {
    private String nombre;
    private String procotolos;
    private String conexiones;

    public Dispositivo(String nombre, String conexiones, String procotolos) {
        this.nombre = nombre;
        this.procotolos = procotolos;
        this.conexiones = conexiones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProcotolos() {
        return procotolos;
    }

    public String getConexiones() {
        return conexiones;
    }
}

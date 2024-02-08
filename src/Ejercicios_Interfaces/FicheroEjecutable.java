package Ejercicios_Interfaces;

public class FicheroEjecutable extends Fichero implements Analizable{
    private byte[] contenido;
    private int permiso;


    public FicheroEjecutable(String nombre, byte[] contenido, int permiso) {
        super(nombre);
        this.contenido = contenido;
        this.permiso = permiso;
    }
    @Override
    public long getSize() {
        return 0;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String analizable() {
        return "Analizando: "+ getNombre();
    }
}

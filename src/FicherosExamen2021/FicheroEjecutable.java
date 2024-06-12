package FicherosExamen2021;

import java.time.LocalDateTime;
import java.util.Arrays;

public class FicheroEjecutable extends Fichero implements Analizable{
    private Byte[] contenido;

    private int permiso;

    public FicheroEjecutable(String nombre, Byte tamanio, LocalDateTime fechaCreacion, Byte[] contenido, int permiso) throws FicheroException {
        super(nombre, tamanio, fechaCreacion);
        this.contenido = contenido;
        setPermiso(permiso);
    }

    public Byte[] getContenido() {
        return contenido;
    }

    public int getPermiso() {
        return permiso;
    }

    public void setPermiso(int permiso) throws FicheroException {
        if (permiso < 0 || permiso > 7) {
            throw new FicheroException("Error el valor introducido no es valido");
        }
        this.permiso = permiso;
    }

    @Override
    public String toString() {
        return super.toString() +
                "FicheroEjecutable{" +
                "contenido=" + Arrays.toString(contenido) +
                ", permiso=" + permiso +
                '}';
    }

    @Override
    public void analizable(FicheroTextoFormateado ficheroTextoFormateado) throws FicheroException {

    }

    @Override
    public void analizable(FicheroEjecutable ficheroEjecutable) throws FicheroException {
        if (ficheroEjecutable instanceof Analizable) {
            System.out.println("analizando el fichero" + getNombre());
        } else {
            throw new FicheroException("Error, no es analizable");
        }
    }
}

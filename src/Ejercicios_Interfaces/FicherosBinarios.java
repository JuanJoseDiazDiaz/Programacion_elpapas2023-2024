package Ejercicios_Interfaces;

public class FicherosBinarios extends Fichero{
    private byte[] ficheroByte;


    public FicherosBinarios(String nombre, byte[] ficheroByte) {
        super(nombre);
        this.ficheroByte = ficheroByte;
    }

    public byte[] getFicheroByte() {
        return ficheroByte;
    }
    @Override
    public long getSize() {
        return super.getSize();
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

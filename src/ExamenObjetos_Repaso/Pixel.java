package ExamenObjetos_Repaso;

public class Pixel {
    private int rojo, azul, verde;
    private boolean defectuoso;

    public Pixel(boolean defectuoso) {
        this.defectuoso = defectuoso;
    }

    public boolean isDefectuoso() {
        return defectuoso;
    }

    public int getRojo() {
        return rojo;
    }

    public void setRojo(int rojo) {
        this.rojo = rojo;
    }

    public int getAzul() {
        return azul;
    }

    public void setAzul(int azul) {
        this.azul = azul;
    }

    public int getVerde() {
        return verde;
    }

    public void setVerde(int verde) {
        this.verde = verde;
    }

}

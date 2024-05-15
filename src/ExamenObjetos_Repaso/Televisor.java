package ExamenObjetos_Repaso;

public class Televisor {
    private int width;
    private int height;
    private String conexion;
    private String protocolo;
    private Pixel[][] panel;

    public Televisor(int width, int height, String conexion, String protocolo) {
        this.width = width;
        this.height = height;
        this.conexion = conexion;
        this.protocolo = protocolo;

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setImagen(String[][] imagen) {

    }

    public String isDefectuoso() {
        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
                panel[i][j].isDefectuoso();
            }
        }
    }
}

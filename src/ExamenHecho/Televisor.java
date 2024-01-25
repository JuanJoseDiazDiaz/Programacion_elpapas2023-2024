package ExamenHecho;

import java.util.Random;

public class Televisor {
    private int anchura;
    private int altura;
    private String protocolos;
    private String conexiones;
    private Pixel[][] panel;

    public Televisor(int anchura, int altura, String protocolos, String conexiones) {
        this.anchura = anchura;
        this.altura = altura;
        this.protocolos = protocolos;
        this.conexiones = conexiones;
        panel = new Pixel[altura][anchura];
        addPixel();
    }
    private void addPixel(){
        for (int i = 0; i < altura; i++){
            for (int j = 0; j < anchura; j++){
                double r = Math.random();
                panel[i][j]= new Pixel(r <= 0.03);
            }
        }
    }

    public boolean isDefectuoso() {
        int cont = 0;
        for (int i = 0; i < altura; i++){
            for (int j = 0; j < anchura; j++){
                if (panel[i][j].isDefectuoso()){
                    cont++;
                }
            }
        }
        return cont >= altura*anchura* 0.03;
    }

    public int getAnchura() {
        return anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setImagen(String[][] imagen) {
        for (int i = 0; i < altura; i++){
            for (int j = 0; j < anchura; j++){
                int rojo = Integer.parseInt(imagen[i][j].substring(1,3), 16);
                int verde = Integer.parseInt(imagen[i][j].substring(3,5), 16);
                int azul = Integer.parseInt(imagen[i][j].substring(5,7), 16);
                panel[i][j].setRojo(rojo);
                panel[i][j].setVerde(verde);
                panel[i][j].setAzul(azul);
            }
        }
    }

    public String getColorPromedio(){
        long rojo= 0; long verde= 0; long azul= 0;
        for (int i = 0; i < altura; i++){
            for (int j = 0; j < anchura; j++){
                rojo += panel[i][j].getRojo();
                verde += panel[i][j].getVerde();
                azul += panel[i][j].getAzul();
            }
        }
        int promedioRojo = (int) (rojo / (altura*anchura));
        int promedioVerde = (int) (verde / (altura*anchura));
        int promedioAzul = (int) (azul / (altura*anchura));

        String color = String.format("#%02X%02X%02X", promedioRojo, promedioVerde, promedioAzul);
        return color;
    }

    public String conectar(Dispositivo dispositivo) throws DispositivoNoCompatibleException{
        String conexionUtilizada = null;
        String[] conexionesTelivisor = conexiones.split(" ");
        String[] conexionesDispositivo = dispositivo.getConexiones().split(" ");

        for (int i = 0; i <conexionesTelivisor.length && conexionUtilizada == null; i++){
            for (int j = 0; j < conexionesDispositivo.length && conexionUtilizada == null; j++){
                if (conexionesTelivisor[i].equals(conexionesDispositivo[j])){
                    conexionUtilizada = conexionesDispositivo[j];
                }
            }
        }
        if (conexionUtilizada == null){
            throw new DispositivoNoCompatibleException("El dispositivo "+ dispositivo.getNombre()+" no tiene ninguna conexión compatible ");
        }

        String protocoloUtilizado = null;
        String[] protocoloTelivisor = protocolos.split(" ");
        String[] protocoloDispositivo = dispositivo.getProcotolos().split(" ");

        for (int i = 0; i < protocoloTelivisor.length && protocoloUtilizado == null; i++){
            for (int j = 0; j < protocoloDispositivo.length && protocoloUtilizado == null; j++){
                if (protocoloTelivisor[i].equals(protocoloDispositivo[j])){
                    protocoloUtilizado = protocoloDispositivo[j];
                }
            }
        }
        if (protocoloUtilizado == null){
            throw new DispositivoNoCompatibleException("El dispositivo "+ dispositivo.getNombre()+" no tiene ningún protocolo compatible");
        }
        return String.format("Dispositivo %s conectado en el puerto %s usando el protocolo %s", dispositivo.getNombre(), conexionUtilizada, protocoloUtilizado);

    }
}

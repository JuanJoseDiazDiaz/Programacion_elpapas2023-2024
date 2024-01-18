package Diaz_Juan_examen;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class Televisor {
    private static int VALOR_MAX_RGB = 255;
    private static int VALOR_MIN_RGB = 0;
    private int anchoPixel;
    private int alturaPixel;
    private String conexiones;
    private String protocolos;
    private String pixeles;


    public Televisor(int anchoPixel, int alturaPixel, String conexiones, String protocolos) {
        this.anchoPixel = anchoPixel;
        this.alturaPixel = alturaPixel;
        this.conexiones = conexiones;
        this.protocolos = protocolos;

    }

    public void comprobacionPixel(){
        String[] pixels = {"rojo","verde","azul"};
        for (int i = 0; i < pixels.length; i++){
            if (pixels[i].equals("rojo") || pixels[i].equals("verde") || pixels.equals("azul")){
                System.out.println("Estan funcionando");
            }else {
                System.out.println("No funcionan");
            }
        }
    }

    public int getWidth() {
        return anchoPixel;
    }

    public int getHeight() {
        return alturaPixel;
    }

    public void setImagen(String[][] imagen) {
        imagen = new String[alturaPixel][anchoPixel];
        Random random = new Random();
        for (int i = 0; i < alturaPixel; i++){
            for (int j = 0; j < anchoPixel; j++){
                // Generar una imagen en forma hexadecimal aleatoriamente
                String imagenActual = String.format("#%06X", random.nextInt(0xFFFFFF + 1));
                imagen[i][j] = imagenActual;
                // aqui guardo un String pasado a un numero entero para despues pasarlo a hexadecimal
                int imagenTelevision = Integer.parseInt(imagenActual);
                // Devolvera un String
                Integer.toHexString(imagenTelevision);
            }
        }

    }


    public String isDefectuoso() {
        for (int i = 0; i < alturaPixel; i++){
            for (int j = 0; j < anchoPixel; j++){
                if (pixeles != pixeles){
                    System.out.println("el televisor funciona a la perfeccion");
                }else {
                    System.out.println("El televisor no funciona");
                }
            }
        }
        return pixeles;
    }

    public String getColorPromedio() {
        String color = Arrays.toString(Imagen.generateRandomColorsPromedio(anchoPixel, alturaPixel, VALOR_MAX_RGB, VALOR_MIN_RGB));
        return color;
    }

    public boolean conectar(Dispositivo bluray) throws DispositivoNoCompatibleException {
        if (bluray.equals(protocolos) || protocolos.equals(2)){
            if (bluray.equals(conexiones) || conexiones.equals(2)){
                System.out.println("son compatibles, se llama "+ bluray + "tambien se usará este protocolo "
                        +protocolos+ " con esta conexion "+ conexiones);
            }
        }else {
            throw new DispositivoNoCompatibleException("Error!, no hay ningun tipo de conexión o\n" +
                    "protocolo compatibles");
        }
        return false;
    }
}

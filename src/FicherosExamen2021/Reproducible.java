package FicherosExamen2021;

import Ejercicios_Interfaces.FicheroAudio;

public interface Reproducible {

    public String reproducir(FicheroVideo ficheroVideo) throws FicheroException;
    public String reproducir(FicherosDeAudio ficherosDeAudio) throws FicheroException;

}

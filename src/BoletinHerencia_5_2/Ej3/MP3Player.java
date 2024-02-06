package BoletinHerencia_5_2.Ej3;

public class MP3Player implements OfflineMusicPlayer{
    public void imprimeMP3(){
        System.out.println("Playing music on MP3 Player");
    }

    @Override
    public void play() {
        imprimeMP3();
    }

    @Override
    public void stop() {

    }

    @Override
    public void load() {

    }
}

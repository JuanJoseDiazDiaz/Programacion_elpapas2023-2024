package BoletinHerencia_5_2.Ej3;

public class MP3Player implements OfflineMusicPlayer{
    public void imprimirMP3(){
        load();
        System.out.println("Playing music on MP3Player");
        stop();
    }

    @Override
    public void play() {
        imprimirMP3();
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on  MP3 Player");
    }


    @Override
    public void load() {
        System.out.println("Loading music on  MP3 Player");
    }
}

package BoletinHerencia_5_2.Ej3;

public class Spotify implements OnlineMusicPlayer{
    public void imprimirSpotify(){
        stream();
        System.out.println("Playing music on Spotify");
        stop();

    }

    @Override
    public void play() {
        imprimirSpotify();

    }

    @Override
    public void stop() {
        System.out.println("Stopping music on Spotify");
    }

    @Override
    public void stream() {
        System.out.println("Streaming music on Spotify");
    }
}

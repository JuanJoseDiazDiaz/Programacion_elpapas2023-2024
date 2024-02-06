package BoletinHerencia_5_2.Ej3;

public class Spotify implements OnlineMusicPlayer{
    public void imprimir(){
        System.out.println("Streaming music on Spotify");
    }

    @Override
    public void play() {
        imprimir();
    }

    @Override
    public void stop() {

    }

    @Override
    public void stream() {

    }
}

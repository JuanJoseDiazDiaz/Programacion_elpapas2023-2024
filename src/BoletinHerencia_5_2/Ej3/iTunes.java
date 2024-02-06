package BoletinHerencia_5_2.Ej3;

public class iTunes implements OfflineMusicPlayer{
    public void imprimirItunes(){
        System.out.println("Loading music on iTunes");
    }

    @Override
    public void play() {
        imprimirItunes();
    }

    @Override
    public void stop() {

    }

    @Override
    public void load() {

    }
}

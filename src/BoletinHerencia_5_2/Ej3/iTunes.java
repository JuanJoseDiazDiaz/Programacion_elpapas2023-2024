package BoletinHerencia_5_2.Ej3;

import javax.sound.midi.Soundbank;

public class iTunes implements OfflineMusicPlayer{
    public void imprimirITunes (){
        load();
        System.out.println("Playing music on iTunes");
        stop();

    }

    @Override
    public void play() {
       imprimirITunes();
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on  iTunes");
    }


    @Override
    public void load() {
        System.out.println("Loading music on  iTunes");
    }
}

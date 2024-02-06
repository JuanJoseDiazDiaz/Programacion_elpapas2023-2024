package BoletinHerencia_5_2.Ej3;

public class MusicApp {
    public static void main(String[] args) {
        iTunes i = new iTunes();
        MP3Player m = new MP3Player();
        Spotify s = new Spotify();

        MusicPlayer [] musicPlayers = {i, m , s};
        System.out.println("Salida: ");
        startMusic(musicPlayers);
    }
    public static void startMusic(MusicPlayer[] players){
        for (MusicPlayer player : players){
            player.play();
        }
    }
}

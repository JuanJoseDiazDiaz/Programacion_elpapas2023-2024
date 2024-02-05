package BoletinHerencia_5_2_ENCASA;

public class EsportsTournament{
    public static void main(String[] args) {
        FPSGamer fpsPlayer = new FPSGamer();
        MobaGamer mobaPlayer = new MobaGamer();
        SportGame sportsPlayer = new SportGame();
        Gamer[] players = {fpsPlayer, mobaPlayer, sportsPlayer};
        empiezaTorneo(players);
    }
    public static void empiezaTorneo (Gamer[] players){
        for (Gamer player : players){
            player.playGame();
        }
    }

}

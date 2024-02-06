package BoletinHerencia_5_2;

public class EsportsTournament {
    public static void main(String[] args) {
        FPSGamer fpsPlayer = new FPSGamer();
        MobaGamer mobaPlayer = new MobaGamer();
        SportGamer sportsPlayer = new SportGamer();
        Gamer[] players = {fpsPlayer, mobaPlayer, sportsPlayer};
        empiezaTorneo(players);
    }
    public static void empiezaTorneo (Gamer[] players){
        for (Gamer player : players){
            player.playGame();
        }
    }
}

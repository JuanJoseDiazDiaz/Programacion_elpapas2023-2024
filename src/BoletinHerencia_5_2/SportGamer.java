package BoletinHerencia_5_2;

public class SportGamer implements Gamer{
    @Override
    public void playGame() {
        imprimirSportGame();
    }
    public void imprimirSportGame (){
        System.out.println("Playing a Sports Game");
    }
}

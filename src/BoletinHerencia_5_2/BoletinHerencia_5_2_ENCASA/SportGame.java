package BoletinHerencia_5_2_ENCASA;

public class SportGame implements Gamer{
    @Override
    public void playGame() {
        imprimirSportGame();
    }
    public void imprimirSportGame (){
        System.out.println("Playing a Sports Game");
    }
}

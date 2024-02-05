package BoletinHerencia_5_2_ENCASA;

public class MobaGamer implements Gamer{
    @Override
    public void playGame() {
        imprimirMobaGamer();
    }
    public void imprimirMobaGamer (){
        System.out.println("Playing a Multiplayer Online Battle Arena Game");
    }
}

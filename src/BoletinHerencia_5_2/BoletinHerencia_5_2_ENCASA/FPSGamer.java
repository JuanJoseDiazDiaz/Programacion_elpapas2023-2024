package BoletinHerencia_5_2_ENCASA;

public class FPSGamer implements Gamer{
    @Override
    public void playGame() {
        imprimir();
    }
    public void imprimir (){
        System.out.println("Playing a First Person Shooter Game");
    }
}

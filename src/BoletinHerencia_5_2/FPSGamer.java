package BoletinHerencia_5_2;

public class FPSGamer implements Gamer{
    @Override
    public void playGame() {
        imprimir();
    }
    public void imprimir (){
        System.out.println("Playing a First Person Shooter Game");
    }
}

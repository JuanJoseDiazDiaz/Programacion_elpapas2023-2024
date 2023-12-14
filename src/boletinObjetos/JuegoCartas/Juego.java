package boletinObjetos.JuegoCartas;

public class Juego {
    private Cartas[] baraja;
    private int cartasRepartidas;
    public Juego(Cartas[] baraja){
        this.baraja = baraja;
        cartasRepartidas = 0;
    }

    public Cartas[] getBaraja(){
        return baraja;
    }

    public void mostrarBaraja(){
        for (int i = cartasRepartidas; i < baraja.length; i++){
            System.out.println(baraja[i]);
        }
    }

    public void barajarCartas(){
        Cartas cartaCambiar;
        for (int i = 0; i < baraja.length; i++) {
            int j = (int) (Math.random() * (i + 1));
            cartaCambiar= baraja[i];
            baraja[i] = baraja[j];
            baraja[j] = cartaCambiar;
        }
    }
    public void repartirCartas(int numJugadores, int numCartas) throws JuegoException {
        if (baraja.length - cartasRepartidas>= (numCartas * numJugadores)){
            for (int i = 0 ; i < numJugadores; i++){
                System.out.println("Repartiendo cartas al jugador"+ (i +1));
                for (int j = 0; j < numCartas; j++){
                    System.out.println("\t"+ baraja[cartasRepartidas]);
                    cartasRepartidas++;
                }
            }
        }else {
            throw new JuegoException("no hay suficientes cartas para repartir");
        }
    }
    public int cartasRestantes (){
       return baraja.length - cartasRepartidas;

    }
}

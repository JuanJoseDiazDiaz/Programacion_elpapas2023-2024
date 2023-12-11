package boletinObjetos.JuegoCartas;

public class Principal {
    public static final String[] palos= {"Espadas", "Oros", "Bastos", "Copas"};
    public  static final int CARTAS_POR_PALOS = 30;

    public static void main(String[] args) {
        Cartas[] baraja = new Cartas[palos.length * CARTAS_POR_PALOS];

        for (int i = 0; i < palos.length; i ++){
            for (int j= 1; j < CARTAS_POR_PALOS;j++){
                baraja[i * CARTAS_POR_PALOS + j] = new Cartas(palos[i], String.valueOf(j+1));
            }
        }
        Juego j = new Juego(baraja);
        try {
            j.repartirCartas(13, 4);
        }catch (JuegoException e){
            System.out.println(e.getMessage());
        }
         j.mostrarBaraja();
        /*
        j.barajarCartas();
        j.repartirCartas(3,4);

         */
    }



}

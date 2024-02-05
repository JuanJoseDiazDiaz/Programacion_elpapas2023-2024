package BoletinHerencias_5_1.JuegoDeRoll;

public class ArrayP implements CreableEstadisticas{
    private Personaje[] personajes;
    public static final int NUM_PERSONAJES_MAX = 100;

    public ArrayP() {
        this.personajes = new Personaje[NUM_PERSONAJES_MAX];
    }

    @Override
    public double minimo() throws PersonajeException {
        double valorVidaMin = Personaje.VIDA_MIN;
        int cont = 0;
        for (int i = 0; i < personajes.length; i++){
            if (personajes[i] != null){
                cont++;
                if (valorVidaMin > personajes[i].getVidaActual()){
                    valorVidaMin = personajes[i].getVidaActual();
                }
            }
        }
        if (cont == 0){
            throw new PersonajeException("no hay personajes guardados");
        }
        return valorVidaMin;
    }

    @Override
    public double max() throws PersonajeException {
        double valorVidaMax = Personaje.VIDA_MAX;
        int cont = 0;
        for (int i = 0; i < personajes.length; i++){
            if (personajes[i] != null){
                cont++;
                if (valorVidaMax > personajes[i].getVidaActual()){
                    valorVidaMax = personajes[i].getVidaActual();
                }
            }
        }
        if (cont == 0){
            throw new PersonajeException("no hay personajes guardados");
        }
        return valorVidaMax;
    }

    @Override
    public double media() throws PersonajeException {
        double valorVida = 0;
        int cont = 0;
        for (int i = 0; i < personajes.length; i++){
            if (personajes[i] != null){
                cont++;
                valorVida += personajes[i].getVidaActual();
            }
        }
        if (cont == 0){
            throw new PersonajeException("no hay personajes guardados");
        }
        return valorVida/cont;
    }
}

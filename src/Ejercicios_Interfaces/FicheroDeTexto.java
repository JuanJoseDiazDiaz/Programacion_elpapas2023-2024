package Ejercicios_Interfaces;

public abstract class FicheroDeTexto extends Fichero implements Convertible{

    private String[] matriz;


    public FicheroDeTexto(String nombre, byte[] matriz) {
        super(nombre);
    }

    public String[] getMatriz() {
        return matriz;
    }

    @Override
    public long getSize() {
        long acumulador = 0;
        for (int i = 0; i < matriz.length; i++){
            acumulador += matriz[i] == null ? 0 : matriz[i].length(); // TODO ESTO ES UNA TERNARIA(cod ? Vtrue : Vfalse)
        }
        return acumulador;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public String convertir() {
        StringBuilder guardar = new StringBuilder();
        for (int i = 0; i < matriz.length; i++){
            if (matriz[i] != null){
                guardar.append(matriz[i]);
            }
        }
        return guardar.toString();
    }
}

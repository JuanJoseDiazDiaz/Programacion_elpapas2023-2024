package Juan_Jose_Diaz_ExamenObjetosRecuperacion;

public class CajaCambios {
    private int numVelocidades;
    private boolean estado;

    public CajaCambios(int numVelocidades){
        this.numVelocidades = numVelocidades;
    }

    public int getNumVelocidades() {
        return numVelocidades;
    }

    public boolean isEstadoCajaCambios() { // TODO -> Recuerda darle el mensaje luego cuando lo ultilices
        if (numVelocidades <= 7){
            System.out.println("Las marchas estan perfectas");
            return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return "CajaCambios{" +
                "numVelocidades=" + numVelocidades +
                ", estado=" + estado +
                '}';
    }
}

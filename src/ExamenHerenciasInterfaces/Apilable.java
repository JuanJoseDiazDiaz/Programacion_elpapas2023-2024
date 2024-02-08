package ExamenHerenciasInterfaces;

public interface Apilable {
    public default void apilar(Jueguete jueguete) throws JuegueteException {
        if (!(jueguete instanceof Apilable)){
            throw new JuegueteException("El juguete no es apilable");
        }
        if (jueguete == this){
            throw new JuegueteException("No puedes apilarte a ti mismo");
        }
        if (jueguete.getClass() != this.getClass()){
            throw new JuegueteException("No puedes apilar un jueguete de tipo: "+jueguete.getClass().getSimpleName() +
                    " con un jueguete de tipo "+ this.getClass().getSimpleName());
        }

    }
}

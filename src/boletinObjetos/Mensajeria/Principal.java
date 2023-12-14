package boletinObjetos.Mensajeria;

public class Principal {
    public static void main(String[] args) throws MensajeException {
        Persona p1 = new Persona("Manolo");
        Persona p2 = new Persona("Juan");
        try{
            p1.enviarMensaje(p2, "Examen BD", "illo como llevas el examen?");

        }catch (MensajeException m){
            System.out.println(m.getMessage());
        }
        p1.mostrarBuzonSalida();
        p2.mostrarBuzonEntrada();
    }
}

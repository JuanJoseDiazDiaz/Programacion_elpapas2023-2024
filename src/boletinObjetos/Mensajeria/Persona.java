package boletinObjetos.Mensajeria;

public class Persona {
    private static final int TAMANO_BANDEJA = 5;
    private String nombre;

    private Mensaje[] mensajesRecibidos;

    private Mensaje[] mensajesEnviados;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.mensajesRecibidos = new Mensaje[TAMANO_BANDEJA];
        this.mensajesEnviados = new Mensaje[TAMANO_BANDEJA];
    }
    public void enviarMensaje(Persona destinatario, String asunto, String cuerpo)throws MensajeException{
        if (destinatario == null){
            throw new MensajeException("Destinatario erroneo");
        }
        if (asunto == null || asunto.length() == 0 ){
            throw new MensajeException("Asunto vacio");
        }
        if (cuerpo == null || cuerpo.length() == 0 ){
            throw new MensajeException("Cuerpo vacio");
        }
        if (mensajesEnviados[TAMANO_BANDEJA -1] != null){
            throw new MensajeException("La bandeja de salida se encuentra llena");
        }
        if (destinatario.mensajesRecibidos[TAMANO_BANDEJA -1] != null){
            throw new MensajeException("La bandeja de entrada se encuentra llena");
        }
        Mensaje m = new Mensaje(asunto, cuerpo,this, destinatario);

        //TODO: BANDEJA DE ENVIADOS
        boolean posVacia = false;
        for (int i = 0; i < TAMANO_BANDEJA && !posVacia; i++){
            if (mensajesEnviados[i] == null){
                mensajesEnviados[i] = m;
                posVacia = true;
            }
        }
        //TODO: BANDEJA DE RECIBIDOS
        boolean posVacia2 = false;
        for (int i = 0; i < TAMANO_BANDEJA && !posVacia2; i++){
            if (destinatario.mensajesRecibidos[i] == null){
                destinatario.mensajesEnviados[i] = m;
                posVacia2 = true;
            }
        }
    }
    public void mostrarBuzonEntrada(){
        if (mensajesRecibidos[0] == null){
            System.out.println("La bandeja de entrada esta vacia");
        }else {
            System.out.println("Bandeja de Entrada");
            for (int i = 0; i < TAMANO_BANDEJA && mensajesRecibidos[i] != null; i++){
                System.out.println(mensajesRecibidos[i]);
            }
        }
    }
    public void mostrarBuzonSalida(){
        if (mensajesEnviados[0] == null){
            System.out.println("La bandeja de Salida esta vacia");
        }else {
            System.out.println("Bandeja de Salida");
            for (int i = 0; i < TAMANO_BANDEJA && mensajesEnviados[i] != null; i++){
                System.out.println(mensajesEnviados[i]);
            }
        }
    }
    public void borrarMensajesEnviadoMasAntiguo() throws MensajeException {
        if (mensajesEnviados[0]== null){
            throw new MensajeException("Su bandeja de salida esta vacia");
        }
        boolean salir = false;
        for (int i =1 ; i < TAMANO_BANDEJA && !salir; i++){
            mensajesEnviados[i- 1 ] = mensajesEnviados[i];
            mensajesEnviados[i] = null;
            if (i < TAMANO_BANDEJA - 1 && mensajesEnviados[i+1] == null){
                salir = true;
            }
        }
    }
    public void borrarMensajesRecibidoMasAntiguo() throws MensajeException {
        if (mensajesEnviados[0]== null){
            throw new MensajeException("Su bandeja de entrada esta vacia");
        }
        boolean salir = false;
        for (int i =1 ; i < TAMANO_BANDEJA && !salir; i++){
            mensajesEnviados[i- 1 ] = mensajesEnviados[i];
            mensajesEnviados[i] = null;
            if (i < TAMANO_BANDEJA - 1 && mensajesEnviados[i+1] == null){
                salir = true;
            }
        }
    }
}

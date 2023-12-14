package boletinObjetos.Mensajeria;

import java.time.LocalDate;

public class Mensaje {
    private  String asunto;
    private String cuerpo;
    private LocalDate fechaEnvio;
    private Persona remitente;

    private Persona destinatario;

    public Mensaje(String asunto, String cuerpo, Persona remitente, Persona destinatario) {
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getAsunto() {
        return asunto;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "asunto='" + asunto + '\'' +
                ", cuerpo='" + cuerpo + '\'' +
                ", remitente=" + remitente +
                ", destinatario=" + destinatario +
                '}';
    }
}

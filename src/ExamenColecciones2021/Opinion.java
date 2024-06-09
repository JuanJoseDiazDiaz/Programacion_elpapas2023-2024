package ExamenColecciones2021;

public class Opinion extends Pelicula {
	private int valoracion;
	private String texto;

	public Opinion(String titulo, int annoEstreno, int valoracion, String texto) throws NetPleaseException {
		super(titulo, annoEstreno);
		this.valoracion = valoracion;
		this.texto = texto;
	}

	public int getValoracion() {
		return valoracion;
	}
	
	public String getTexto() {
		return texto;
	}
	@Override
	public String toString() {
		return "Opinion [valoracion=" + valoracion + ", texto=" + texto + "]";
	}
	
	
	
}

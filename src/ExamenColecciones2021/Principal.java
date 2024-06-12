package ExamenColecciones2021;

public class Principal {

	public static void main(String[] args) {
		
		NetPlease netPlease=new NetPlease();

		try {


			netPlease.annadirTema("DISPAROS", "Bad boys", 2026);
			netPlease.annadirTema("ACCION", "Mercenarios", 2025);
			netPlease.annadirTema("DRAMA", "Antes de ti ", 2027);
			
			netPlease.addPelicula("COMEDIA", new Pelicula("BAJO EL MISMO TECHO", 2025));
			
			netPlease.listadoDeTodasPeliculasDeTodosLosTemas();
			netPlease.borrarPeliculaDeUnTema("COMEDIA", "Bad boys");
			netPlease.temaDePelicula("Bad boys");

		} catch (NetPleaseException e) {
			System.err.println(e.getMessage());
		}
		
	}

}

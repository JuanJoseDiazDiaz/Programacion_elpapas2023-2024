package boletinRepasoExamen.Avion.ExamenColecciones.ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListaGenerica<T> {

	private LinkedList<T> lista;

	public ListaGenerica() {
		lista = new LinkedList<T>();
	}

	public void annadirElemento(T elemento) {
		lista.add(elemento);
	}

	public LinkedList<T> listaHastaElemento( T elementoBuscado){
		LinkedList<T> listaElementoBuscado = new LinkedList<>();
		for (T elemento : lista){
			listaElementoBuscado.add(elemento);
			if (elemento.equals(elementoBuscado)){
				return listaElementoBuscado;
			}

		}
		return null;
	}


	

	@Override
	public String toString() {
		return "ListaGenerica=" + lista ;
	}
	
	
	
}

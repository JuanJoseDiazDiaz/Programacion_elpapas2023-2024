package Boletin6_Listas.EjercicioColecciones_2.ejercicio2;

import java.util.LinkedList;


public class ListaGenerica<T extends Comparable<? super T>> {

	private LinkedList<T> lista;

	public ListaGenerica() {
		lista = new LinkedList<T>();
	}

	public void annadirElemento(T elemento) {
		lista.add(elemento);
	}

	public ListaGenerica<T> listaHastaElemento(T elementoBuscado){
		ListaGenerica<T> listaElementoBuscado = new ListaGenerica<>();
		for (T elemento : lista){
			listaElementoBuscado.annadirElemento(elemento);
			if (elemento.equals(elementoBuscado)){
				return listaElementoBuscado;
			}

		}
		return null;
	}

	public ListaGenerica<T> elementosMenores(T elementoReferencia){
		ListaGenerica<T> listaGenerica = new ListaGenerica<>();
		for (T elemento : lista){
			if (elemento.compareTo(elementoReferencia) < 0){
				listaGenerica.annadirElemento(elementoReferencia);
			}
		}
		return listaGenerica.lista.isEmpty()? null : listaGenerica;
	}


	

	@Override
	public String toString() {
		return "ListaGenerica=" + lista ;
	}



}

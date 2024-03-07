package Boletin6_Listas.Ejercicio5;

import java.util.*;
import java.util.stream.Stream;

public class Diccionario {
    private Map<String, List<String>> diccionario;

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }


    public void addLetter(String palabra, String definicion){
        if (!this.diccionario.containsKey(palabra)){
            List<String> definiciones = new ArrayList<>();
            this.diccionario.put(palabra,definiciones);
            definiciones.add(definicion);
        }else {
            this.diccionario.get(palabra).add(definicion);
        }
    }
    public List<String> searchLetter(String palabra) throws DiccionarioException {
        List<String> definiciones = this.diccionario.get(palabra);
        if (definiciones == null){
            throw new DiccionarioException("Palabra no encontrada");
        }
        return definiciones;
    }

    public void removeLetter(String palabra) throws DiccionarioException {
        List<String> definiciones = this.diccionario.get(palabra);
        if (definiciones == null){
            throw new DiccionarioException("Palabra no encontrada");
        }
    }

    public List<String> listadoPalabra (String palabra) throws DiccionarioException {
        Set<String> claves = this.diccionario.keySet();
        List<String> palabraEscondida = new ArrayList<>();
        for (String palabras :claves){
            if (palabras.startsWith(palabra)){
                palabraEscondida.add(palabra);
            }
        }
        return palabraEscondida;
    }
    public List<String> listadoPalabrasFlujo(String comienzoPalabra){
        return this.diccionario.keySet().stream().filter(palabra -> palabra.startsWith(comienzoPalabra)).toList();
    }

}

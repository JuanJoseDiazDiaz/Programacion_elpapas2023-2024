package Boletin6_Listas.Ejercicio4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        reverse(arrayList).stream().forEach(i -> System.out.println(i));

    }

    private static <T> ArrayList<T> reverse ( ArrayList<T> arrayOriginal){
        int cont = 0;
        ArrayList <T> arrayNuevo = new ArrayList<T>();
       while (cont < arrayOriginal.size()){
           arrayNuevo.add(arrayOriginal.get(arrayOriginal.size() -1 -cont));
           cont++;
       }
        return arrayNuevo;
    }

    private static <T> ArrayList<T> reverse2 (ArrayList<T> arrayOriginal){
        int cont = 0;
        ArrayList <T> arrayNuevo = new ArrayList<T>(arrayOriginal.size());
        Iterator<T> t = arrayOriginal.iterator();
        while (t.hasNext()){
            arrayNuevo.set(arrayOriginal.size() -1 -cont, t.next());
            cont++;
        }
        return arrayNuevo;
    }

}

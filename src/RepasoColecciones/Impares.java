package RepasoColecciones;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Impares {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);

        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            Integer imp = it.next();
            if (imp % 2 != 0) {
                it.remove();
            }
        }
    }

}

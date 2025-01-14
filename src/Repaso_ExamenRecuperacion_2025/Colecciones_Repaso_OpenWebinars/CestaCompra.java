package Repaso_ExamenRecuperacion_2025.Colecciones_Repaso_OpenWebinars;

import java.util.HashMap;
import java.util.Map;

public class CestaCompra {

    private Map<Producto, Integer> cesta;

    public CestaCompra() {
        this.cesta = new HashMap<>();
    }

    // todo -> Metodos a hacer: add, remove, clear, total, get
    //todo -> Add
    public void addproducto(Producto producto) {
        if (cesta.containsKey(producto)) {
            cesta.replace(producto, cesta.get(producto) + 1);
        }
    }

    // todo -> Remove
    public void removeproducto(Producto producto) {
        if (cesta.containsKey(producto)) {
            cesta.remove(producto);
        } else {
            System.out.println("No existe el producto");
        }
    }
    // todo -> Clear
    public void clearCesta(){
        cesta.clear();
    }

    //todo -> Total
    public double totalcesta(){
       return cesta.values().stream().mapToDouble(i->i).sum();
    }


    //todo -> Get
    public Map<Producto, Integer> getCesta() {
        return cesta;
    }
}

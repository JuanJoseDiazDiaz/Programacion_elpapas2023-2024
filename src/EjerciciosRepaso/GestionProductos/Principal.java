package boletinRepasoExamen.Avion.EjerciciosRepaso.GestionProductos;

public class Principal {
    public static void main(String[] args) {
        ProductoBasico productoBasico = new ProductoBasico("Cuaderno", 30);
        ProductoAbstracto productoAbstracto = new ProductoAbstracto("Amor", 30) {
            @Override
            public double setPrecio() {
                return 0;
            }

            @Override
            public double calcularPrecio() {
                return 0;
            }
        };
        ProductoElectronico productoElectronico = new ProductoElectronico("Movil", 500, 2015);

        System.out.println("Precio de: "+productoBasico.getNombre()+" = "+productoBasico.calcularPrecio());
        System.out.println("Precio de: "+productoElectronico.getNombre()+" = "+ productoElectronico.calcularPrecio());
        System.out.println("Precio de: "+productoAbstracto.getNombre()+" = "+productoAbstracto.calcularPrecio());


    }

}

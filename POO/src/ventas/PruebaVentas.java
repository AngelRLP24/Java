package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas***");
        var producto1 = new Producto("Jugo de mango", 15);
        var producto2 = new Producto("Papas adobadas", 16);

        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostarOrden();

        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Doritos", 10));
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.mostarOrden();
    }
}

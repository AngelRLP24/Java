public class DetalleProducto {
    public static void main(String[] args){
        String nombreProducto = "Papas Sabor Jalapeño";
        System.out.println("nombreProducto = " + nombreProducto);
        float precioProducto = 16.50F;
        System.out.println("precioProducto = " + precioProducto);
        int cantidadDisponibleProducto = 60;
        System.out.println("cantidadDisponibleProdcto = " + cantidadDisponibleProducto);
        boolean esDisponibleParaVenta = true;
        System.out.println("esDisponibleParaVenta = " + esDisponibleParaVenta);
        /// ----------------------------------------
        System.out.println();
        nombreProducto = "Jugo Sabor Mango";
        System.out.println("nombreProducto = " + nombreProducto);
        precioProducto = 10;
        System.out.println("precioProducto = " + precioProducto);
        cantidadDisponibleProducto = 0;
        System.out.println("cantidadDisponibleProducto = " + cantidadDisponibleProducto);
        esDisponibleParaVenta = false;
        System.out.println("esDisponibleParaVenta = " + esDisponibleParaVenta);
        
    }
}

package ventas;

public class Orden {
    private final int ID_ORDEN;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrden;

    public Orden(){
        this.ID_ORDEN = ++Orden.contadorOrden;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if (contadorProductos < MAX_PRODUCTOS)
            this.productos[this.contadorProductos++] = producto;
        else
            System.out.println("Se alcanzo el maximo de productos: " + Orden.MAX_PRODUCTOS);
    }

    public double calcularTotal(){
        double total = 0;
        for (var index = 0; index < this.contadorProductos; index++){
            var producto = this.productos[index];
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostarOrden(){
        System.out.println("ID Orden: " + this.ID_ORDEN);
        System.out.println("\tTotal de la orden: $" + this.calcularTotal());
        System.out.println("\tLista de productos:");
        for (var index = 0; index < this.contadorProductos; index++) {
            System.out.println("\t\t" + this.productos[index]);
        }
    }

}

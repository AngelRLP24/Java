package ventas;

public class Producto {
    private final int ID_PRODUCTO;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    public Producto(String nombre, double precio){
        this.ID_PRODUCTO = ++Producto.contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getID_PRODUCTO(){
        return this.ID_PRODUCTO;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "ID_PRODUCTO= " + ID_PRODUCTO +
                ", nombre= '" + nombre + '\'' +
                ", precio= " + precio +
                '}';
    }
}
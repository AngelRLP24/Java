package pedidos;

public class Juguete {
    private final int ID_JUGETE;
    private String nombre;
    private double precio;
    static int contadorJugete;

    public Juguete(String nombre, double precio){
        this.ID_JUGETE = ++Juguete.contadorJugete;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getID_JUGETE(){
        return this.ID_JUGETE;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Jugete{" +
                "ID_JUGETE= " + ID_JUGETE +
                ", nombre=' " + nombre + '\'' +
                ", precio= " + precio +
                '}';
    }
}

package pedidos;

public class Pedido {
    private final int ID_PEDIDO;
    private Juguete[] jugutes;
    private int contadorJuguetes;
    private static final int MAX_JUGUETES = 10;
    private static int contadorPedido;

    public Pedido(){
        this.ID_PEDIDO = ++Pedido.contadorPedido;
        this.jugutes = new Juguete[MAX_JUGUETES];
    }

    public void agregarJuguete(Juguete juguete){
        if (contadorJuguetes < MAX_JUGUETES)
            this.jugutes[this.contadorJuguetes++] = juguete;
        else
            System.out.println("Se alcanzo del maximo de jugetes: " + Pedido.MAX_JUGUETES);
    }

    public double calculaTotal(){
        var total = 0;

        for (var index = 0; index < this.contadorJuguetes; index++){
            var precioJuguete = jugutes[index].getPrecio();
            total += precioJuguete;
        }
        return total;
    }

    @Override
    public String toString(){
        var mensaje = "ID PEDIDO: " + this.ID_PEDIDO + "\n";
        mensaje += "\t TOTAL DEL PEDIDO: " + this.calculaTotal() + "\n";
        mensaje += "\t\t LISTA DE JUGUETES:\n";
        for (var index = 0; index < this.contadorJuguetes; index++){
            var juguete = jugutes[index];
            mensaje +=  "\t\t" +  juguete + "\n";
        }

        return mensaje;
    }

}

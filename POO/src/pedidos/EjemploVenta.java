package pedidos;

public class EjemploVenta {
    public static void main(String[] args) {
        var juguete1 = new Juguete("Carro azul", 35);
        System.out.println(juguete1);
        var juguete2 = new Juguete("Muñeca", 150);

        var pedido1 = new Pedido();
        pedido1.agregarJuguete(juguete1);
        pedido1.agregarJuguete(juguete2);
        System.out.println(pedido1);

        var pedido2 = new Pedido();
        pedido2.agregarJuguete(new Juguete("Luchador", 50));
        pedido2.agregarJuguete(juguete2);
        pedido2.agregarJuguete(juguete1);
        System.out.println(pedido2);
    }
}

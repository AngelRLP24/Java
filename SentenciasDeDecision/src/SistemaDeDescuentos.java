import java.util.Scanner;

public class SistemaDeDescuentos {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        final var COMPRA_MINIMA = 1000.00;

        System.out.print("Cuanto fue el monto de tu compra?: ");
        var montoCompra = Double.parseDouble(sc.nextLine().strip());
        System.out.print("Cuentas con membresia (true/false)?: ");
        var tieneMembresia = Boolean.parseBoolean(sc.nextLine().strip());

        double descuento = 0.0;

        if ( montoCompra >= COMPRA_MINIMA && tieneMembresia){
            descuento = 0.1;
        } else if (tieneMembresia) {
            descuento = 0.05;
        } else {
            descuento = 0;
        }

        if (descuento != 0){
            var montoDescuento = montoCompra * descuento;
            var total = montoCompra - montoDescuento;
            System.out.printf("""
                    ----------------------------------------------
                    felicidades, obtiviste un descuento del %.0f%%
                    \tSubtotal de la compra: $%.2f
                    \tMonto del descuento: $%.2f
                    \tMonto final de la compra: $%.2f
                    """, descuento * 100, montoCompra, montoDescuento, total);
        } else {
            System.out.printf("""
                    ----------------------------------------------
                    No obtuviste ningun descuento
                    Te recomendamos hacerte socio
                    \tMonto final de la compra: $%.2f
                    """, montoCompra);
        }
    }
}

import java.util.Scanner;

public class SistemaDeReservacionHoteles {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        final var CUARTO_SIN_VISTA_MAR = 150.50;
        final var CUARTO_CON_VISTA_MAR = 190.50;

        System.out.print("Nombre del cliente: ");
        var nombreCliente = sc.nextLine().strip();
        System.out.print("Dias de estadia: ");
        var diasEstadia = Integer.parseInt(sc.nextLine().strip());
        System.out.print("Con vista al mar: ");
        var vistaAlMar = Boolean.parseBoolean(sc.nextLine().strip());

        //var tieneVistaAlMar = (vistaAlMar) ? "SI :)" : "No :(";
        var costoTotal = (vistaAlMar) ? diasEstadia * CUARTO_CON_VISTA_MAR : diasEstadia * CUARTO_SIN_VISTA_MAR;

        System.out.printf("""
                ----------Detalles de la reservacion ----------
                Cliente : %s
                Dias de estadia: %d
                Costo total: $%.2f
                Habitacion con vista al mar: %s
                """, nombreCliente, diasEstadia, costoTotal, (vistaAlMar) ? "SI :)" : "No :(");
    }
}

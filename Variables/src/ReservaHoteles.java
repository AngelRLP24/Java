public class ReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hotel ***");
        String nombreCompleto = "Angel Rodolfo Lucas Perez";
        var diasEstancia = 5;
        final var TARIFA_DIARIA = 450;
        boolean tieneVistaAlMar = true;

        System.out.println("nombreCompleto = " + nombreCompleto);
        System.out.println("diasEStancia = " + diasEstancia);
        System.out.println("TARIFA_DIARIA = " + TARIFA_DIARIA);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);

        System.out.println();

        nombreCompleto = "Juan Manuel Aguilar";
        diasEstancia = 7;
        tieneVistaAlMar = false;

        System.out.println("nombreCompleto = " + nombreCompleto);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("TARIFA_DIARIA = " + TARIFA_DIARIA);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);
    }
}

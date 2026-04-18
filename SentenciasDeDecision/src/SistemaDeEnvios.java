import java.util.Scanner;

public class SistemaDeEnvios {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        final var COSTO_NACIONAL_POR_KG = 10;
        final var COSTO_INTERNACIONAL_POR_KG = 20;

        System.out.print("Destino (Nacional/Internacional): ");
        var destino = sc.nextLine().strip().toUpperCase();

        System.out.print("Peso Kg del paquete: ");
        var pesoKg = Double.parseDouble(sc.nextLine().strip());

        var costoDeEnvio = switch (destino) {
            case "NACIONAL" -> pesoKg * COSTO_NACIONAL_POR_KG;
            case "INTERNACIONAL" -> pesoKg * COSTO_INTERNACIONAL_POR_KG;
            default -> {
                System.out.println("Ingresa una opcion correcta de envio");
                yield null;
            }
        };

        if ( costoDeEnvio != null){
            System.out.printf("""
                %nCosto de Envio
                -----------------
                \tTipo de envio: %s
                \tPero kg: %.2f
                \tTotal de pago: %.2f
                """, destino, pesoKg, costoDeEnvio);
        }
    }
}

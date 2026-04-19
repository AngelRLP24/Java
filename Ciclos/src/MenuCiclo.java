import java.util.Scanner;

public class MenuCiclo {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var continua = false;

        while (!continua) {
            System.out.print("""
                    Sistema de cuenta
                    -----------------
                    1. Crear cuenta
                    2. Eliminar Cuenta
                    3. Salir
                    """);
            System.out.println("Selecciona una opcion: ");
            var opcion = sc.nextLine().strip();

            switch (opcion) {
                case "1" -> {
                    System.out.println("Creando cuenta");
                }
                case "2" -> {
                    System.out.println("Eliminado Cuenta");
                }
                case "3" -> {
                    System.out.println("Saliendo...");
                    continua = true;
                }
                default -> {
                    System.out.println("Opcion no valida");
                }
            };
            System.out.println("-----------------");
        }
        System.out.println("Fin del sistema");
    }
}

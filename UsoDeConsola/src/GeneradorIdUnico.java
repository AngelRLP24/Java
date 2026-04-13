import java.util.Random;
import java.util.Scanner;
public class GeneradorIdUnico {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var random = new Random();

        System.out.print("Ingresa el nombre: ");
        var nombreUsuario = sc.nextLine();
        System.out.print("Ingresa el apellido: ");
        var apellidoUsuario = sc.nextLine();
        System.out.print("Ingresa el año de nacimiento (YYYY): ");
        var anioNacimientoUsuario = sc.nextLine();

        var numeroRandom = random.nextInt(9999) + 1;

        var nombreResultado = nombreUsuario.substring(0, 2).toUpperCase().strip();
        var apellidoResultado = apellidoUsuario.substring(0, 2).toUpperCase().strip();
        var anioNacimientoResultado = anioNacimientoUsuario.substring(2).strip();

        System.out.printf("""
                \nHola %s,
                \tTu nuevo número de identificacion (id) generado por el sistema es:
                \t%s%s%s%04d
                \tFelicidades!
                \n
                """, nombreUsuario, nombreResultado, apellidoResultado, anioNacimientoResultado, numeroRandom);
    }
}

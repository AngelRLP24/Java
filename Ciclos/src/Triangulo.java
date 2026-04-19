import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Coloca las filas que tendra tu triangulo: ");
        var numeroDeFilas = Integer.parseInt(sc.nextLine().strip());

        for (int fila = 1; fila <= numeroDeFilas; fila++){
            var espacioEnBlanco = " ".repeat(numeroDeFilas - fila);
            var caracter = "*".repeat(2 * fila - 1);
            System.out.println(espacioEnBlanco + caracter);
        }

    }
}

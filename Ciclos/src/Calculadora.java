import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var continuar = false;
        double numero1 = 0.0, numero2 = 0.0, resultado = 0.0;

        System.out.println("*** Calculadora ***");
        while(!continuar) {
            System.out.print("""
                    Operacion que puedes realizar
                    -----------------------------
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Divicion
                    5. Salir
                    Selecciona una opcion:\s""");
            var opcion = Integer.parseInt(sc.nextLine().strip());

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el numero 1: ");
                numero1 = Double.parseDouble(sc.nextLine().strip());
                System.out.print("Ingresa el numero 2: ");
                numero2 = Double.parseDouble(sc.nextLine().strip());
            }

            switch (opcion) {
                case 1 -> {
                    resultado = numero1 + numero2;
                    System.out.printf("Resultado de tu suma es: " + resultado + "\n");
                }
                case 2 -> {
                    resultado = numero1 - numero2;
                    System.out.printf("Resultado de tu resta es: " + resultado + "\n");
                }
                case 3 -> {
                    resultado = numero1 * numero2;
                    System.out.printf("Resultado de tu multiplicacion es: " + resultado + "\n");
                }
                case 4 -> {
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.printf("Resultado de tu divicion es: " + resultado + "\n");
                    } else
                        System.out.println("No Aplica el divisor");
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                    continuar = true;
                }
                default -> System.out.println("Opcion invalida");
            }
        }
        System.out.println("Fin de la calculadora");
    }
}

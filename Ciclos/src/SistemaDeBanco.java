import java.util.Scanner;

public class SistemaDeBanco {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var continiar = false;
        var SALDO = 1500.00;

        System.out.println("*** Sistema de Banco ***");

        while(!continiar){
            System.out.print("""
                    Menu de opciones bancarias
                    --------------------------
                    1. Consultar saldo
                    2. Depositar
                    3. Retirar
                    4. Salir
                    Selecciona una opcion:\s""");
            var opcion = Integer.parseInt(sc.nextLine().strip());

            switch(opcion){
                case 1 -> System.out.println("Saldo actual de: $" + SALDO);

                case 2 -> {
                    System.out.print("Ingresa el monto a depositar: ");
                    var deposito = Double.parseDouble(sc.nextLine().strip());
                    if (deposito >= 0) {
                        SALDO += deposito;
                        System.out.println("Saldo actual de: $" + SALDO);
                    } else
                        System.out.println("Monto a depositar no aplica: " + deposito);
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    var retiro = Double.parseDouble(sc.nextLine().strip());
                    if ( retiro <= SALDO && retiro > 0){
                        SALDO -= retiro;
                        System.out.println("Saldo actual de: " + SALDO);
                    } else
                        System.out.println("El monto a retirar no aplica: " + retiro);
                }
                case 4 -> {
                    System.out.println("Saliendo...");
                    continiar = true;
                }
                default -> System.out.println("Opcion invalida");
            }
        }
        System.out.println("Fin del sistema");
    }
}
import java.util.Scanner;

public class SistemaDeAutenticacion {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        final var USUARIO_CORRECTO = "admin";
        final var PASSWORD_CORRECTA = "123";

        System.out.println("*** Sistema de autenticacion ***");

        System.out.print("Ingresa tu usuario: ");
        var usuario = sc.nextLine().strip();
        System.out.print("Ingresa tu password: ");;
        var password = sc.nextLine().strip();

        var sonCorrectosLosDatos = usuario.equals(USUARIO_CORRECTO) && password.equals(PASSWORD_CORRECTA);
        System.out.println("Datos correctos?: " + sonCorrectosLosDatos);

        var sonIncorrectosLosDatos = !(usuario.equals(USUARIO_CORRECTO) && password.equals(PASSWORD_CORRECTA));
        System.out.println("Datos incorrectos?: " + sonIncorrectosLosDatos);
    }
    }
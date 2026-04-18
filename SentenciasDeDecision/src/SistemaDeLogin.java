import java.util.Scanner;

public class SistemaDeLogin {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        final var USUARIO_CORRECTO = "admin";
        final var PASSWORD_CORRECTA = "123";

        System.out.print("Ingresa el usuario: ");
        var usuario = sc.nextLine().strip();
        System.out.print("Ingresa password: ");
        var password = sc.nextLine().strip();

        var mensaje = switch(usuario){
            case USUARIO_CORRECTO -> {
                if (PASSWORD_CORRECTA.equals(password))
                    yield "Bienvenido al sistema " + usuario;
                else
                    yield "Password incorrecta, intenta de nuevo";
            }
            default -> {
                if (PASSWORD_CORRECTA.equals(password))
                    yield "Usuario incorrecto, intenta de nuevo";
                else
                    yield "Usuario y Password incorrectos, intenta de nuevo";
            }
        };

        System.out.println(mensaje);
    }
}

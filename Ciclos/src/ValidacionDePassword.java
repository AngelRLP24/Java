import java.util.Scanner;

public class ValidacionDePassword {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Ingresa un password de al menos 6 caracteres: ");
        var password = sc.nextLine().strip();

        while (password.length() < 6 ){
            System.out.println("La passwor no cumple debe tener al menos 6 caracteres");
            System.out.print("Intenta de nuevo: ");
            password = sc.nextLine().strip();
        }

        System.out.println("Bien, la password Si aplica");
    }
}

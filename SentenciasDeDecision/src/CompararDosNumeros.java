import java.util.Scanner;

public class CompararDosNumeros {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        System.out.print("Ingresa el primer numero entero: ");
        var numero1 = Integer.parseInt(sc.nextLine().strip());
        System.out.print("Ingresa el segundo numero entero: ");
        var numero2 = Integer.parseInt(sc.nextLine().strip());

        System.out.println((numero1 >= numero2) ? "Numero 1 mayor: " + numero1 : "Numero 2 mayor: " + numero2);
    }
}

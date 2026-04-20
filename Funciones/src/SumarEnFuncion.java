import java.util.Scanner;

public class SumarEnFuncion {

    static int sumaFuncion (int numero1, int numero2){ return numero1 + numero2; }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Coloca el primer numero: ");
        var numero1 = Integer.parseInt(sc.nextLine().strip());

        System.out.print("Coloca el segundo numero: ");
        var numero2 = Integer.parseInt(sc.nextLine().strip());

        var resultado = sumaFuncion(numero1, numero2);

        System.out.println("El resultado de sumar " + numero1 +" + " + numero2 + " = " + resultado);
    }
}

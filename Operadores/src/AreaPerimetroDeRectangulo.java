import java.util.Scanner;

public class AreaPerimetroDeRectangulo {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("*** Area y Perimetro de un Rectangulos ***");

        System.out.print("Ingresa la base del rectangulo (cm): ");
        var base = Float.parseFloat(sc.nextLine().strip());

        System.out.print("Ingresa la altura del rectangulo (cm): ");
        var altura = Float.parseFloat(sc.nextLine().strip());

        var area = base * altura;
        var perimetro = 2 * (base + altura);

        System.out.printf("""
                %n
                La area y perimetro de tu rectangulo es:
                ----------------------------------------
                \tArea: %.2f
                \tPerimetro: %.2f
                """, area, perimetro);
    }
}
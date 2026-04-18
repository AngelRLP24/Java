import java.util.Scanner;

public class EstacionDelAnio {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Ingresa el valor del mes (1 - 12): ");
        var valorEstacion = Integer.parseInt(sc.nextLine().strip());

        var estacion = switch (valorEstacion) {
            case 1, 2, 12 -> "invierno";
            case 3, 4, 5 -> "primavera";
            case 6, 7, 8 -> "otoño";
            case 9, 10, 11 -> "invierno";
            default -> "Estacion desconocida";
        };

        System.out.println("Estammos en " + estacion);

//        var estacion = "";
//
//        if ( valorEstacion == 1 || valorEstacion == 2 || valorEstacion == 12)
//            estacion = "Estamos en invierno";
//         else if (valorEstacion == 3 || valorEstacion == 4 || valorEstacion == 5)
//            estacion = "Estamos en primavera";
//         else if (valorEstacion == 6 || valorEstacion == 7 || valorEstacion == 8)
//            estacion = "Estamos en verano";
//         else if (valorEstacion == 9 || valorEstacion == 10 || valorEstacion == 11)
//            estacion = "Estamos en otoño";
//         else
//            estacion = "Estacion desconocida";
//
//        System.out.printf("La estacion para el mes de %d es %s", valorEstacion, estacion);

    }
}

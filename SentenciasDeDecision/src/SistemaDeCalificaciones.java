import java.util.Scanner;

public class SistemaDeCalificaciones {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Cual es tu calificacion (0 - 10)?: ");
        var calificacionNumerica = Double.parseDouble(sc.nextLine().strip());

        var calificacionLetra = "";

        if ( calificacionNumerica >= 9 && calificacionNumerica <= 10){
            calificacionLetra = "A";
        } else if (calificacionNumerica == 8) {
            calificacionLetra = "B";
        } else if (calificacionNumerica == 7) {
            calificacionLetra = "C";
        } else if (calificacionNumerica == 6) {
            calificacionLetra = "D";
        } else if ( calificacionNumerica >= 0 && calificacionNumerica < 6) {
            calificacionLetra = "F";
        } else {
            calificacionLetra = "Valor desconocido";
        }

        System.out.printf("Tu calificacion: %.1f esta en el rango de %s", calificacionNumerica, calificacionLetra);
    }
}

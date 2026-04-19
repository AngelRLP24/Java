import java.util.Scanner;

public class SistemaDeCalificaciones {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Cuantas calificaciones vas a añadir?: ");
        var largoArreglo = Integer.parseInt(sc.nextLine().strip());

        var calificaciones = new int[largoArreglo];

        for (var indice = 0; indice < largoArreglo; indice++){
            System.out.print("Coloca la calificacion " + ( indice + 1) + ": ");
            calificaciones[indice] = Integer.parseInt(sc.nextLine().strip());
        }

        double sumaCalificaciones = 0.0;

        for ( var indice = 0; indice < largoArreglo; indice++)
            sumaCalificaciones += calificaciones[indice];

        double promedio = sumaCalificaciones / largoArreglo;

        System.out.println("El promedio es de: " + promedio);
    }
}

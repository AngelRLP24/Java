import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Coloca el tamaño del arreglo: ");
        var tamanioArreglo = Integer.parseInt(sc.nextLine().strip());

        var enteros = new int[tamanioArreglo];

        for (var indice = 0; indice < tamanioArreglo; indice++){
            System.out.print("Coloca el valor del indice [" + indice + "]: ");
            enteros[indice] = Integer.parseInt(sc.nextLine().strip());
        }

        for (var indice = 0; indice < tamanioArreglo; indice++)
            System.out.println("Indice[" + indice + "] tiene el valor de: " + enteros[indice]);
    }
}

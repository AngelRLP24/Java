import java.util.Scanner;

public class MatrizDinamica {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Coloca los renglones de la matriz: ");
        var renglones = Integer.parseInt(sc.nextLine().strip());
        System.out.print("Coloca las columna de la matriz: ");
        var columnas = Integer.parseInt(sc.nextLine().strip());

        int[][] matriz = new int[renglones][columnas];
//        var matriz2 = new int[renglones][columnas];

        for (var ren = 0; ren < matriz.length; ren++){
            for (var colum = 0; colum < matriz[ren].length; colum++){
                System.out.print("Asignale el valor a la matriz en la pocision [" + ren
                        + "][" + colum + "]: ");
                matriz[ren][colum] = Integer.parseInt(sc.nextLine().strip());
            }
        }

        for (var ren = 0; ren < matriz.length; ren++)
            for (var colum = 0; colum < matriz[ren].length; colum++)
                System.out.println("Valor en la pocision [" + ren + "][" + colum +"]: " + matriz[ren][colum]);
    }
}

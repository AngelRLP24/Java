import java.util.Scanner;

public class SumaDiagonal {
    public static void main(String[] args) {
//        int[][] numeros = new int[][] {
//                {100, 200, 300},
//                {400, 500, 600},
//                {700, 800, 900}
//        };

        var sc = new Scanner(System.in);

        System.out.print("Coloca los renglones de la matriz: ");
        var renglones = Integer.parseInt(sc.nextLine().strip());
        System.out.print("Coloca las columna de la matriz: ");
        var columnas = Integer.parseInt(sc.nextLine().strip());

        int[][] numeros = new int[renglones][columnas];

        for (var ren = 0; ren < renglones; ren++){
            for (var colum = 0; colum < columnas; colum++){
                System.out.print("Coloca el valor de la pocicion [" + ren + "][" + colum + "]: ");
                numeros[ren][colum] = Integer.parseInt(sc.nextLine().strip());
            }
        }

        var sumaNumeros = 0;

        for (var renglon = 0; renglon < numeros.length; renglon++)
            for (var columna = 0; columna < numeros[renglon].length; columna++){
                if ( renglon == columna)
                    sumaNumeros += numeros[renglon][columna];
            }

        System.out.println("El resultado de la suma en diagonal es: " + sumaNumeros);
    }
}

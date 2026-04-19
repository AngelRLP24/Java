public class ArregloBidimencional {
    public static void main(String[] args) {
//        final var RENGLON = 2;
//        final var COLUMNA = 3;

//        int[][] matriz = new int[RENGLON][COLUMNA];
        var matriz = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };

        for (var renglon = 0; renglon < matriz.length; renglon++){
            for (var columna = 0; columna < matriz[renglon].length; columna++)
                System.out.println(matriz[renglon][columna]);
        }
    }
}

public class NumerosImpares {
    public static void main(String[] args) {
        var contador = 0;

        System.out.println("While");

        while ( contador <= 20){
            if ( contador % 2 != 0)
                System.out.print(contador + " ");
            contador++;
        }

        System.out.println();
        System.out.println("Do While");

        var contador2 = 0;

        do {
            if ( contador2 % 2 != 0 )
                System.out.print(contador2 + " ");
            contador2++;
        }while ( contador2 <= 20);
    }
}

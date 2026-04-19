public class SumaAcumulativa {
    public static void main(String[] args) {
        final var MAXIMO = 5;
        int acomuladorSuma = 0, numero = 1;

        System.out.println("While");
        while ( numero <= MAXIMO )
            acomuladorSuma += numero++;
        System.out.println(acomuladorSuma);

        int acomuladorSuma2 = 0, numero2 = 1;

        System.out.println("Do While");
        do {
            acomuladorSuma2 += numero2++;
        }while ( numero2 <= MAXIMO);

        System.out.println(acomuladorSuma2);

        int acomuladorSuma3 = 0;

        System.out.println("For");
        for (int numero3 = 1; numero3 <= MAXIMO; numero3++)
            acomuladorSuma3 += numero3;
        System.out.println(acomuladorSuma3);
    }
}

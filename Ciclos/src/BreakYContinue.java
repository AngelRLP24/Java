public class BreakYContinue {
    public static void main(String[] args) {

        System.out.println("Break");
        for (int numero = 1; numero < 10; numero++){
            if ( numero % 2 == 0){
                System.out.println(numero);
                break;
            }
        }

        System.out.println("Continue");
        for (int numero = 1; numero < 10; numero++){
            if ( numero % 2 != 0)
                continue;
            System.out.println(numero);
        }
    }
}

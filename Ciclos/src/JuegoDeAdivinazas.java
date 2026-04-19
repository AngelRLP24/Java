import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinazas {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        var random = new Random();
        var numeroRandom = random.nextInt(50) + 1;

        final var INTENTOS_MAXIMOS = 5;
        var contadorIntentos = 0;

        var numero = 0;

        System.out.println(numeroRandom);
        while ( numero != numeroRandom && contadorIntentos < INTENTOS_MAXIMOS){
            System.out.print("Coloca un numero del 0 al 50: ");
            numero = Integer.parseInt(sc.nextLine().strip());

            if ( numero < numeroRandom )
                System.out.println("El numero es mayor");
            else if ( numero > numeroRandom)
                System.out.println("El numero es menor");

            contadorIntentos++;
        }

        if ( numero == numeroRandom){
            System.out.println("Bien hecho el numero era: " + numeroRandom);
            System.out.println("Lo cumpliste en el intento No." + contadorIntentos);
        } else
            System.out.println("Perdiste, ya no te quedan intentos el numero era: " + numeroRandom);
    }
}
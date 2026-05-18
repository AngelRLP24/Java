public class Excepciones {
    public static void main(String[] args) {
        int numerador = 10, denominador = 0;

        try {
            var resultado = numerador / denominador;
            System.out.println("resultado = " + resultado);
        }catch(Exception e){
            System.out.println("No se puede dividir entre 0 = " + e);
        }
    }
}

public class Foreach {
    public static void main(String[] args) {

        var edad = new int[5];
        double[] salario = new double[5];
        var numeros = new int[] {1, 2, 3, 4, 5};

        double total = 0;
        for (int numero : numeros) {
            System.out.println("Numero = " + numero);
            total += numero;
        }
        System.out.println("Total = " + total);
    }
}

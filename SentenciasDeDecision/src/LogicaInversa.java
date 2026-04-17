import java.util.Scanner;
public class LogicaInversa {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Deseas cancelar tu compra (true/false)?: ");
        var esCancelado = Boolean.parseBoolean(sc.nextLine());

        if (!esCancelado){
            System.out.println("La compra no se cancelo");
        } else {
            System.out.println("La compra se cancelo");
        }
    }
}

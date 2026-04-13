import java.util.Scanner;
public class SistemaEmpleados {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        var nombre = sc.nextLine();
        System.out.print("Ingresa tu edad: ");
        var edad = Integer.parseInt(sc.nextLine());
        System.out.print("Ingresa el salario: ");
        var salario = Double.parseDouble(sc.nextLine());
        System.out.print("Es jefe de departamento? (true/false): ");
        var esJefeDeDepartamento = Boolean.parseBoolean(sc.nextLine());

        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad + " años");
        System.out.printf("salario = $%.2f%n", salario);
        System.out.println("esJefeDeDepartamento = " + esJefeDeDepartamento);
    }
}

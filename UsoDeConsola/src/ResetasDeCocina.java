import java.util.Scanner;
public class ResetasDeCocina {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        System.out.println("*** Recetas de Cocina ***");
        System.out.print("Ingresa el nombre: ");
        var nombreReceta = sc.nextLine();
        System.out.print("Ingresa los ingredientes: ");
        var ingredientes = sc.nextLine();
        System.out.print("Ingresa el tiempo de preparacion (min): ");
        var tiempoPreparacion = Integer.parseInt(sc.nextLine());
        System.out.print("Ingresa la dificultad: ");
        var dificultad = sc.nextLine();

        System.out.println("Nombre receta: " + nombreReceta);

        var listaIngredientes = ingredientes.replace(" ", "\n");
        System.out.println("Ingredientes: " + listaIngredientes);
        System.out.println("Tiempo de preparacion: " + tiempoPreparacion);
        System.out.println("Dificultad de la receta: " + dificultad);
    }
}

public class FuncionRecursiva {

    static void funcionRecursiva(int numero){
        if ( numero == 1 )
            System.out.println(numero);
        else {
            System.out.println(numero);
            funcionRecursiva( numero - 1);
        }

    }

    public static void main(String[] args){
        funcionRecursiva(3);
    }
}

package aritmetica;

public class Aritmetica {
    public static double dividir(int numero1, int numero2) throws Exception{
        if (numero2 == 0)// throw es reportar una new excepcion
            throw new Exception("No se puede Dividir por 0");//Excepcion en tiempo de ejecucion
        return numero1 / numero2;
    }
}

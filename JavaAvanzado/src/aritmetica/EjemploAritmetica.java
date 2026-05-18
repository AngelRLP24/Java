package aritmetica;

public class EjemploAritmetica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.dividir(10, 0);
            System.out.println("resultado = " + resultado);
        }catch(Exception e){
            System.out.println("Ocurrio un error = " + e);
        }
    }
}

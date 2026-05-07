package aritmetica.prueba_aritmetica;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //Crear el objeto 1
        var objeto1 = new Aritmetica(10, 5);
        objeto1.sumar();
        objeto1.restar();

        System.out.println();
        //Crear objeto 2
        var objeto2 = new Aritmetica(7, 3);
        objeto2.sumar();
        objeto2.restar();
    }
}

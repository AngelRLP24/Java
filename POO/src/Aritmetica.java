public class Aritmetica {
    int numero1;
    int numero2;

    public Aritmetica(){

    }

    //Creamos el constructor
    public Aritmetica(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    void sumar(){
        var resultado = this.numero1 + this.numero2;
        System.out.println("EL resultado de la suma es: " + resultado);
    }

    void restar(){
        var resultado = this.numero1 - this.numero2;
        System.out.println("El resultado del la suma es: " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("Creacion de la clase, atributos y metodos");
        //Objeto 1
        var operacion1 = new Aritmetica(10, 5);
//        operacion1.numero1 = 10;
//        operacion1.numero2 = 5;
        operacion1.sumar();
        operacion1.restar();
//
//        System.out.println();
//        Objero 2
        var operacion2 = new Aritmetica();
        operacion2.numero1 = 3;
        operacion2.numero2 = 2;
        operacion2.sumar();
        operacion2.restar();
    }
}

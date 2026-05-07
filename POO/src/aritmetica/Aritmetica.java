package aritmetica;

public class Aritmetica {

    private int numero1;
    private int numero2;

    public Aritmetica(){
        System.out.println("Ejecutando constructor 2");
    }

    public Aritmetica(int numero1, int numero2){
        System.out.println("Ejecutando constructor 1");
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void sumar(){
        var resultado = this.numero1 + this.numero2;
        System.out.println("resultado de la suma = " + resultado);
    }

    public void restar(){
        var resultado = this.numero1 - this.numero2;
        System.out.println("resultado de la resta = " + resultado);
    }

    public int getNumero1(){
        return this.numero1;
    }

    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return this.numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}

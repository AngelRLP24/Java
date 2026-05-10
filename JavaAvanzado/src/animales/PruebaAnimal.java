package animales;

public class PruebaAnimal {

    static void hacerSonidoPilimor(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        Animal perro1 = new Perro("Solobino" , 1);
        System.out.println(perro1);
        perro1.hacerSonido();

        Animal gato1 = new Gato("Pepe", 2);
        hacerSonidoPilimor(gato1);

    }
}

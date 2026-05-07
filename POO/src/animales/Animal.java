package animales;

public class Animal {

//    protected void comer(){
//        System.out.println("Como mucho");
//    }
//
//    protected void dormir(){
//        System.out.println("Duermo mucho");
//    }

    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}
class Perro extends Animal{

    @Override
    protected void hacerSonido(){
        System.out.println("Guauuu");
    }

//    public void hacerSonido(){
//        System.out.println("Guauuu");
//    }
//
//    @Override
//    protected void comer(){
//        System.out.println("Como 3 veces al dia");
//    }
}

class Gato extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("Miauuu");
    }
}

class PruebaAnimal{

    static void traerSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {

        Animal animal1 = new Gato();
        traerSonido(animal1);


















//        //Creamos un objeto de la clase animal
//        var animal1 = new Animal();
//        System.out.println("Objeto de la clase padre, Animal");
//        animal1.comer();
//        animal1.dormir();
//
//        System.out.println();
//
//        //Creamos objeto de la subclase Perro
//        System.out.println("Objeto de la clase hija, Perro");
//        var perro1 = new Perro();
//        perro1.comer();
//        perro1.dormir();
//        perro1.hacerSonido();
    }
}






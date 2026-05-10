public interface Traductor {
    //Public and abtracts
    void traducir();
    default void iniciarTraductor(){
        System.out.println("Iniciando Traductor");
    }
}

class Ingles implements Traductor{
    @Override//No se Sobrescribe
    public void traducir(){//Primera Implementacion
        System.out.println("Tradusco a Ingles");
    }
}

class Frances implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Tradusco a Frances");
    }

    @Override
    public void iniciarTraductor(){
        System.out.println("Traductor ahora en ingles");
    }
}

class EjmeploTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
        System.out.println();
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();

        String saludo = String.join(" ", "Hola", "Mundo", "en", "Java");
        System.out.println(saludo);
        String saludo2 = saludo.replace(" ", ".");
        System.out.println(saludo2);
        String saludo3 = saludo2.toUpperCase();
        System.out.println(saludo3);

    }
}

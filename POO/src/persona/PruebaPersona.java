package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        //Creamos el primer objeto
        System.out.println(Persona.contadorPersona);
        var persona1 = new Persona("Angel", "Perez");
        System.out.println(persona1);
        System.out.println(Persona.contadorPersona);

        System.out.println();

        Persona persona2 = new Persona("Juan", "lopez");
        System.out.println(persona2);
        System.out.println(Persona.contadorPersona);
    }
}

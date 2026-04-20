public class Persona {
    String nombre;
    String apellido;

    void mostarPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("Creacion de un creaccion de una clase, atributos y metodos");
        // Crear objetos
        var persona1 = new Persona(); //Primer objeto
        persona1.nombre = "Luis";
        persona1.apellido = "Pineda";
        persona1.mostarPersona();;
        System.out.println();
        var persona2 = new Persona();
        persona2.nombre = "Pepe";
        persona2.apellido = "Ortiz";
        persona2.mostarPersona();
    }
}

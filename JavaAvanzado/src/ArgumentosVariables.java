public class ArgumentosVariables {
    private final int ID_USUARIO;
    private String nombre;
    private int edad;
    static private int contadorUsuario;

    public ArgumentosVariables(String nombre, int edad){
        this.ID_USUARIO = ++ArgumentosVariables.contadorUsuario;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "ID_USUARIO = " + this.ID_USUARIO
                + ", Nombre = " + this.nombre
                + ", Edad = " + this.edad
                + ", Referencia de Memoria = " + super.toString();
    }
}

class EjemploArgumentosVariables {

    static void mostarPersona(ArgumentosVariables... personas){//Aqui se Aplica los argumentos variables
        for (var index = 0; index < personas.length; index++)
            System.out.println(personas[index].toString());
    }

    public static void main(String[] args) {
        ArgumentosVariables[] personas = new ArgumentosVariables[2];
        ArgumentosVariables persona1 = new ArgumentosVariables("Angel", 19);
        ArgumentosVariables persona2 = new ArgumentosVariables("Pepe", 19);
        personas[0] = persona1;
        personas[1] = persona2;

        mostarPersona(persona1, persona2);

    }
}
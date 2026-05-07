package persona;

public class Persona {
    static public int contadorPersona = 0;
    private int id;
    private String nombre;
    private String apellido;

    @Override
    public String toString(){
        return "ID: " + this.id
                +", Nombre: " + this.nombre
                + ", Apellido: " + this.apellido
                + ", Dir. Mem: " + super.toString();
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++Persona.contadorPersona;
    }

    void mostrarPersona(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}

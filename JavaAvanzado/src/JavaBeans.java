import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Luis");
        persona.setApellido("Pineda");

        System.out.println(persona);
    }
}

class Persona implements Serializable {

    private String nombre;
    private String apellido;

    public Persona(){ }

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

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
package plabraThis;

public class PalabraThis {

    public static void main(String[] args) {
        Persona persona=new Persona("juan","perez");
        System.out.println("persona: "+persona);
        System.out.println(persona.apellido+" "+persona.nombre);

    }
}

class Persona{
    String nombre;
    String apellido;

     Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

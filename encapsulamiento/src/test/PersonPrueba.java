package test;
import dominio.Persona;
import dominio.PersonaCol;

public class PersonPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona( "juan",500.00,false);
        persona1.setNombre("juan carlos");
        System.out.println("nombre: "+persona1.getNombre());
        System.out.println("sueldo"+persona1.getSueldo());
        persona1.setSueldo(650.25);
        System.out.println("Sueldo: "+persona1.getSueldo());

        PersonaCol persona2 = new PersonaCol(1200000.0,"guti","juan",true);
        persona2.setNombre("Juan Carlos");
        persona2.setApellido("Gutierrez Huerfano");

        System.out.println(persona2);






    }
}

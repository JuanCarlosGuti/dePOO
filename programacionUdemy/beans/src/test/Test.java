package test;

import domain.Persona;

public class Test {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.setApellido("gutierrez");
        persona.setNombre("juan");
        System.out.println(persona);
    }
}

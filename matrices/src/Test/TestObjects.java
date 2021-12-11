package Test;

import domain.Persona;

public class TestObjects {
    public static void main(String[] args) {
        Persona personas[]=new Persona[2];


        personas[0]=new Persona("juan");

        System.out.println(personas[0]+"  "+personas[1]);
    }
}

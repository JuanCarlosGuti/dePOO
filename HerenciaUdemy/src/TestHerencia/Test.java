package TestHerencia;

import domain.Cliente;
import domain.Empleado;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("juan",'F',35,"calle 36",89456,new Date(),true);
        Empleado empleado1 = new Empleado("carlos",1600000.0);
        System.out.println(cliente1);
        System.out.println(empleado1);
    }

}


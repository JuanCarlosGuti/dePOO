package test;

import domain.*;

public class Test {
    public static void main(String[] args) {
        Empleado empleado1= new Empleado("juan", 5000);
        //System.out.println("empleado1 :"+empleado1.ObtenerDetalles());
        Gerente gesrente1=new Gerente("carlos",6000,"TI");
        //System.out.println("gerente "+gesrente1.ObtenerDetalles());
        imprimir(gesrente1);

    }

    public static void imprimir(Empleado empleado){
        System.out.println("empleado: "+empleado.ObtenerDetalles());
    }


}

package ejecuta;

import mundoPcObjetos.*;

public class Main {
    public static void main(String[] args) {
        Teclado teclado=new Teclado("usb","samsung");
        Teclado teclado2=new Teclado("sopny","vga");
        Monitor monitor1 = new Monitor("Panasonic",23.5);
        Monitor monitor2 =new Monitor("LG",14.5);
        Raton raton1=new Raton("usb","sony");
        Computador computador=new Computador("Sony",monitor1,teclado2,raton1);
        Computador computador1=new Computador("challenger",monitor2,teclado,raton1);
        Orden orden1 = new Orden();
        Orden orden = new Orden();
        orden.agregarComputador(computador);
        orden.agregarComputador(computador1);
        orden.mostrarOrden();

    }
}

package caja;

public class CajaMain {

    public static void main(String[] args) {

        Caja caja1  =new Caja(5,2,3);
        int volumen =caja1.CalculoVolumen();
        System.out.println("ahora el calculo del volumen es: "+volumen);


    }
}

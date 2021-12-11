import java.util.Scanner;

public class Programa {

    Scanner entrada = new Scanner(System.in);
    //metodo constructor


    public void cuantosPaquetes(){
        System.out.println("ingrese el nombre de perrito");
        String nombrePerrito = this.entrada.nextLine();

        System.out.println("ingrese la cantidad necesaria para el perrito");
        float cantComida = this.entrada.nextFloat();

        int contarPaquetes = 0;
        float totalEnPaquetes = 0;

        while (cantComida<3){
            System.out.println("debe comer al menos 3 kilos");
            cantComida = this.entrada.nextFloat();
        }

        while (cantComida>totalEnPaquetes){
            System.out.println("ingrse el peso del paquete");
            totalEnPaquetes+=this.entrada.nextFloat();

            contarPaquetes++;
        }



    }







}

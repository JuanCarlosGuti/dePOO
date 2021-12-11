import java.util.Scanner;

public class cadenaTexto {

    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        boolean sonIguales= true ;
        if (unTextoA.equals(unTextoB)){
            sonIguales = false;
        }
        return sonIguales;

    }

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String texto1 = ingresar.nextLine();
        System.out.println("ingrese otra palabra a comparar");
        String texto2 = ingresar.nextLine();
        boolean valor = cadenasDeTextoDistintas(texto1, texto2);
        if (valor){
            System.out.println(texto1+" y "+texto2+" son diferentes");
        } else {
            System.out.println(texto1+" y "+texto2+" son iguales ");
        }

    }
}

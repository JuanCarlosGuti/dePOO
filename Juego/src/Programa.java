import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese el nombre del primer jugador");
        String nombre1 = ingreso.nextLine();
        System.out.println("Ingrese el nombre del segundo jugador");
        String nombre2 = ingreso.nextLine();

        System.out.println();



    }

    public static int cualGana(String eleccion1, String eleccion2){
        int resultado=0;
        int puntajejugador1;
        int puntajejugador2;


        if(eleccion1 == eleccion2){
            resultado = 0;
        }else if (eleccion1 =="piedra"&& eleccion2=="tijera") {
            resultado = 1;
        }else if (eleccion1 =="piedra"&& eleccion2=="papel"){
            resultado= 2;
        }else if(eleccion1=="tijera"&&eleccion2=="piedra"){
            resultado= 2;
        }else if(eleccion1 == "tijera"&& eleccion2=="papel"){
            resultado = 1;
        }else if(eleccion1 =="papel" && eleccion2 =="tijera"){
            resultado =2;
        }else if (eleccion1 == "papel" && eleccion2 =="piedra"){
            resultado = 1;
        }
        return resultado;
    }

}

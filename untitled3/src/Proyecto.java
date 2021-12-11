import java.util.Scanner;

public class Proyecto {




    static String name(Scanner nombre){

        System.out.println("ingrese su nombre");

        return  nombre.nextLine();
    }

    static String jugada(Scanner jugada, String nombre){

        System.out.println("ingrese su jugada " +nombre);

        return jugada.nextLine();
    }

    static int cualGana(String jugada1, String jugada2){
        int ganador =0;
        if (jugada1.equals("tijera") && jugada2.equals("papel") ){
            ganador =1;
        } else if (jugada1.equals("tijera") && jugada2.equals("piedra")){
            ganador = 2;
        } else if (jugada1.equals("papel") && jugada2.equals("piedra")) {
            ganador = 1;
        } else if (jugada1.equals("papel") && jugada2.equals("tijera")) {
            ganador = 2;
        } else if (jugada1.equals("piedra") && jugada2.equals("papel")){
            ganador = 2;
        } else if (jugada1.equals("piedra") && jugada2.equals("tijera")) {
            ganador = 1;

        }
            return ganador;
        }



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre1 = name(entrada);
        String nombre2 = name(entrada);
        String jugada01 = jugada(entrada,nombre1);
        String jugada02 = jugada(entrada,nombre2);
        int puntos1=0;
        int puntos2=0;

    while (!jugada01.equals("*")||!jugada02.equals("*")){
        if (cualGana(jugada01,jugada02)==1){
            puntos1++;
        } else if(cualGana(jugada01,jugada02)==2){
            puntos2++;
        }
        jugada01=jugada(entrada,nombre1);
        jugada02=jugada(entrada,nombre2);
    }
        System.out.println(nombre1+" obtuvo: "+puntos1);
        System.out.println(nombre2+" obtuvo: "+puntos2);

        if(puntos1>puntos2){
            System.out.println("el ganador es: "+nombre1);
        }else {
            System.out.println("el ganador es: "+nombre2);
        }
    }


    }




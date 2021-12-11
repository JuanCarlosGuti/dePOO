import java.util.Scanner;

public class palabras {


    public static boolean esPrimo(int numero){
        boolean primo = true;
        if (numero == 0 || numero == 1){
            primo = false;
        }
        for (int i = 2;i<numero;i++){

            if (numero % i ==0 ){
                primo = false;
            }
        }

        return primo;
    }


    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = ingreso.nextInt();
        boolean num = esPrimo(numero);
        if (num){
            System.out.println(numero+" Es primo");
        } else {
            System.out.println( numero + " No es primo");
        }

    }




}
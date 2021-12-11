import java.util.Scanner;

public class tresNumeros {
    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);
        System.out.println("ingrese un primer numero ");
        int numero1 = ingreso.nextInt();
        System.out.println("ingrese un segundo numero ");
        int numero2 = ingreso.nextInt();
        System.out.println("ingrese un tercer numero ");
        int numero3 = ingreso.nextInt();
        int Valor = mayor(numero1,numero2,numero3);

        System.out.println( Valor+ " es el numero mayor ");

    }

    public static int mayor(int num1, int num2, int num3){
        if (num1>num2){
            if (num1>num3){
                return num1;
            } else{
                return num3;
            }
        } if (num2>num3){
            return num2;
        }else {
            return num3;
        }
    }
}

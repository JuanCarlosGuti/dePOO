import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        int numero1 = ingreso.nextInt();
        int numero2 = ingreso.nextInt();
        int valor = sumar(numero1, numero2);
        int valor1 = resta(numero1, numero2);
        double valor2 = division(numero1, numero2);
        int valor3 = multiplicar(numero1, numero2);

        System.out.println("la suma es "+ valor);
        System.out.println("la resta es "+ valor1);
        System.out.println("la division es "+valor2);
        System.out.println("la multiplicación es "+valor3);
    }

    public static int sumar(int a, int b){
        int valorsuma = a + b;


        return valorsuma;


    }
    public static int resta(int a, int b) {
        int valorresta = a - b;


        return valorresta;
    }
    public static double division(int a, int b) {
        int valordivision = a / b;


        return valordivision;
    }
    public static int multiplicar(int a, int b) {
        int valormultiplicar = a * b;


        return valormultiplicar;
    }
}

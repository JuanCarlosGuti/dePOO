import java.util.Arrays;
import java.util.Scanner;

public class sintaxis {
    public static void main(String[] args){
        String nombre;
        String apellido;
        char inicial;
        //instanciar el objeto de tipo Scanner

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        nombre = entrada.nextLine();
        System.out.println(nombre);
        inicial= nombre.charAt(0);
        System.out.println(inicial);

    }
}

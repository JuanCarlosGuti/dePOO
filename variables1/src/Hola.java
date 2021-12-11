import java.util.Scanner;

public class Hola {

    public static void main(String[] args) {
      int numero;
      var texto= "valor desconocido";

      System.out.println("ingresa un numero");
      Scanner ingreso = new Scanner(System.in);
      numero=ingreso.nextInt();
      switch(numero){
        case 1:
          texto="numero uno";
                  break;
        case 2:
          texto="numero dos";
                  break;
        case 3:
          texto="numero tres";
                  break;
        case 4:
          texto="numero cuatro";
        default:
          texto = "caso no encontrado";
      }

      System.out.println("el valor es "+texto);


    }
}

package domain;

import static domain.Aritmetica.division;
import domain.OperacionExcepcion;

public class Test {
    public static void main(String[] args) {
        int resultado =0;
        try {
            resultado = division(10,0);
        }catch (OperacionExcepcion e){
            System.out.println("ocurrio un error de tipo operacion excepcion");
            System.out.println(e.getMessage());

        }
        catch (Exception e){
            System.out.println("ocurrio un error: ");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("se reviso la division entre cero");
        }
        System.out.println("resultado: "+resultado);

    }



}

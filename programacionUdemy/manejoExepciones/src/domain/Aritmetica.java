package domain;



public class Aritmetica {
    public static int division(int numerador, int denominador) throws OperacionExcepcion{
        if (denominador==0){
            throw new OperacionExcepcion("division entre cero");
        }
        return numerador/denominador;
    }
}

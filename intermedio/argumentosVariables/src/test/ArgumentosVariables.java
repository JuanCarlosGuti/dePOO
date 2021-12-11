package test;

public class ArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2);

    }
    private static void imprimirNumeros(int... numeros){
        for (int i =0; i<numeros.length;i++){
            System.out.println("elementos: "+numeros[i]);
        }

    }
}

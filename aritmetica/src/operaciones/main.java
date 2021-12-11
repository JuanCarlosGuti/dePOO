package operaciones;

public class main {
    public static void main(String[] args) {
        Aritmetica aritemetica1=new Aritmetica();
        aritemetica1.a=5;
        aritemetica1.b=8;
        aritemetica1.suma();
        int resultado=aritemetica1.sumaretorno();
        System.out.println("el resiltado con retorno es: "+resultado);
    }
}

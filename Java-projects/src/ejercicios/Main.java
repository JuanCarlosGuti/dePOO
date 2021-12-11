package ejercicios;

public class Main {
    public static void main(String[] args) {
        Nave nave1 = new Nave(2, 4, 'N', 50., 100);
        nave1.irA(3,6,'S');
        System.out.println(nave1.toString());

}
}

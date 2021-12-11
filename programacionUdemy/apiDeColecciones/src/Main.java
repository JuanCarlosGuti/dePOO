public class Main {
    public static void main(String[] args) {
        Clasegenerica<Integer> objetoInt = new Clasegenerica<>(15);
        objetoInt.obtenerTipo();

        Clasegenerica<String> objetoString= new Clasegenerica<>("juan");
        objetoString.obtenerTipo();
    }
}

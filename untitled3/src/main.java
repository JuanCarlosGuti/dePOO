public class main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(123, "favio");
        cliente1.incrementarDeuda(20000.);
        Cliente cliente2 = new Cliente(123, "Sofi");
        cliente2.incrementarDeuda(20000.);
    }
}

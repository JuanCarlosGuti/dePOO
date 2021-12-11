package estados;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("jabor rey",2000);
        Producto p2 = new Producto("bonbril",3500);
        Producto p3 = new Producto("colgate",4500 );
        Producto p4 = new Producto("diana",1800);
        Carrito car1 = new Carrito();

        try {
            car1.pasarSiguiente();
            car1.agregarProducto(p1);
        } catch (ExcepcionesCarro e) {
            System.err.println(e.getMessage());
        }

    }
}

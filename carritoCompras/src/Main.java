public class Main {
    public static void main(String[] args) {

        Carrito carrito = new Carrito();
        carrito.cancelarCarrito();
        carrito.volverPuntoAnterior();
        carrito.agregarProducto(new Producto("pepsi"));
    }
}

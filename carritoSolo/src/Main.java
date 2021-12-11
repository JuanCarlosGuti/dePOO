public class Main {
    public static void main(String[] args) {
        Producto p1= new Producto("jabon manos",1500);
        Producto p2= new Producto("crema",2500);
        Producto p3= new Producto("escoba",3500);
        Producto p4= new Producto("escoba", 4500);

        Carrito carrito1= new Carrito();
        carrito1.agregarProducto(p2);
        carrito1.cancelarCarrito();
        carrito1.volverAnterior();
        carrito1.pasarAlSiguiente();
        carrito1.agregarProducto(p1);
        carrito1.agregarProducto(p2);
        System.out.println(carrito1);


    }
}

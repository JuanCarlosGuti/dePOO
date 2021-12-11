package test;

import paquete.Orden;
import paquete.Producto;

public class TestVentas {
    public static void main(String[] args) {
        Producto producto1 = new Producto("camisa", 6000);
        Producto producto2 = new Producto("Pantalon", 8000);
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
    }
}

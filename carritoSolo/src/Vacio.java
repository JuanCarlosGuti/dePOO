import java.util.ArrayList;

public class Vacio implements EstadoCarrito{

    private Carrito c;

    public Vacio(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto p, ArrayList<Producto> productos) {
        System.out.println("no se pueden agregar productos porque esta vacio");

    }

    @Override
    public void cancelarCarrito() {
        System.out.println(" no pasa nada por que esta vacio");

    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("no tiene punto anteriro porque esta vacio");

    }

    @Override
    public void pasarPuntoSiguiente() {
        c.setEstado(new Cargando(c));
        System.out.println("pasa a estado vacio");
    }
}

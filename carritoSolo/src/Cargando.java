import java.util.ArrayList;

public class Cargando implements EstadoCarrito{

    private Carrito c;

    public Cargando(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto p, ArrayList<Producto> productos) {
      productos.add(p);
        System.out.println("se agrega un producto al carrito");


    }

    @Override
    public void cancelarCarrito() {
        c.setEstado(new Vacio(c));
        System.out.println(" el carrito se cancela y vuelve a estar vacio");

    }

    @Override
    public void volverPuntoAnterior() {
        c.setEstado(new Vacio(c));
        System.out.println("el punto anterior es vacio");

    }

    @Override
    public void pasarPuntoSiguiente() {
        c.setEstado(new Pagando(c));

    }
}

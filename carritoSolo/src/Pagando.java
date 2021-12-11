import java.util.ArrayList;

public class Pagando implements EstadoCarrito {

    private Carrito c;

    public Pagando(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto p, ArrayList<Producto> productos) {
        System.out.println("no se puede agregar prodcutos ya que esta pagando");
    }

    @Override
    public void cancelarCarrito() {
        c.setEstado(new Vacio(c));
        System.out.println(" el carrito se cancela y vuelve a estar vacio");


    }

    @Override
    public void volverPuntoAnterior() {
        c.setEstado(new Cargando(c));
        System.out.println("vuelve al punto anterior en estado Cargando");

    }

    @Override
    public void pasarPuntoSiguiente() {
        c.setEstado(new Cerrado(c));
        System.out.println("pasa a estar cerrado");

    }
}

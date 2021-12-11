import java.util.ArrayList;

public class Cerrado implements EstadoCarrito {
    private Carrito c;

    public Cerrado(Carrito c) {
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
        System.out.println("no puede regresar al punto anterior");

    }

    @Override
    public void pasarPuntoSiguiente() {
        System.out.println(" esta en el ultimo punto y por ende no puede pasar a otro punto");

    }
}

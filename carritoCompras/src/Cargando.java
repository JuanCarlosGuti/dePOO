public class Cargando implements SatateCarrito{

    private Carrito c;

    public Cargando(Carrito c) {

        this.c = c;

        System.out.println(" el Carrito esta cargado");
    }

    @Override
    public void agregarProducto() {
        System.out.println(" al carrito se le añaden productos");
        Producto p= new Producto();
        c.agregarProducto(p);

        System.out.println(" el carrito sigue en estado Cargando ");

    }

    @Override
    public void cancelarCarrito() {
        System.out.println("el carrito se cancela y pasa de nuevo a estar vacio");
        c.setEstado(new Vacio(c));

    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println(" el carrito vuelve al estado anterior en este caso Vacio ");
        c.setEstado(new Vacio(c));

    }

    @Override
    public void pasarAlsiguiente() {
        System.out.println(" el Carrito pasa al estado pagando");
        c.setEstado(new Pagando(c));

    }
}

public class Vacio implements SatateCarrito{

    private Carrito c;

    public Vacio(Carrito c) {

        this.c = c;
        System.out.println(" el Carrito esta vacio");

    }

    @Override
    public void agregarProducto() {
        System.out.println(" al carrito se le añaden productos");
        Producto p= new Producto();
        c.agregarProducto(p);

        System.out.println(" el carrito pasa a estar cargando");
        c.setEstado(new Cargando(c));




    }

    @Override
    public void cancelarCarrito() {
        System.out.println(" el carrito vuelve si gue vacio no pasa nada");


    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println(" no pasa nada porque esta vacio y no hay un punto anterior");


    }

    @Override
    public void pasarAlsiguiente() {
        System.out.println("al carrito pasa si productos al siguiente estado Cargando");
        c.setEstado(new Cargando(c));

    }
}

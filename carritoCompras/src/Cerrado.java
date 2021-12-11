public class Cerrado implements SatateCarrito {
    private Carrito c;

    public Cerrado(Carrito c) {

        this.c = c;
        System.out.println(" el Carrito esta Cerrado");
    }

    @Override
    public void agregarProducto() {
        System.out.println("como esta cerrado no agrega productos");

    }

    @Override
    public void cancelarCarrito() {

        System.out.println(" el carrito vueleve a estar vacio");
        c.setEstado(new Vacio(c));

    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("el carrito como esta ccerrado no puede volver al punto anterior");

    }

    @Override
    public void pasarAlsiguiente() {
        System.out.println(" cerrado es el ultimo estado por ende no puede pasar a otro estado");

    }
}

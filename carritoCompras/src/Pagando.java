public class Pagando implements SatateCarrito {

    private Carrito c;

    public Pagando(Carrito c) {

        this.c = c;
        System.out.println("los productos del Carrito se estan pagando");
    }

    @Override
    public void agregarProducto() {

        System.out.println("como esta pagando no puede agregar productos");

    }

    @Override
    public void cancelarCarrito() {
        System.out.println(" el carrito se cancela y pasa de nuevo a estar vacio");
        c.setEstado(new Vacio(c));
    }

    @Override
    public void volverPuntoAnterior() {

        System.out.println(" el carrito vuelve al estado Cargando");
        c.setEstado(new Cargando(c));


    }

    @Override
    public void pasarAlsiguiente() {
        System.out.println(" el carrito pasa al siguiente estado Cerrado");
        c.setEstado(new Cerrado(c));
    }
}

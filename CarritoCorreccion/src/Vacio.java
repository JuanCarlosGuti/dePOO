import java.util.List;

public class Vacio implements EstadoCarrtio {

    private Carrito c;

    public Vacio(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto producto, List<Producto> productos) {
        System.out.println("no se puede agregar prodcutos ya que esta vacio");

    }

    @Override
    public void cancelar() {
        System.out.println("al cancelar no pasa nada ya que esta en estado vacio");

    }

    @Override
    public void volverPuntoanterior() {
        System.out.println("como esta vacio no hay punto anterior");

    }

    @Override
    public void avanzar() {

        c.setEstado(new Cargando(c));
        System.out.println(" pasa a esatdo Cargando");



    }


}

import java.util.List;

public class Cerrado implements EstadoCarrtio{
    private Carrito c;

    public Cerrado(Carrito c) {
        this.c = c;
    }


    @Override
    public void agregarProducto(Producto producto, List<Producto> productos) {
        System.out.println("no se hace nada ya que estamos cerrados");

    }

    @Override
    public void cancelar() {
        System.out.println("no se hace nada ya que estamos cerrados");

    }

    @Override
    public void volverPuntoanterior() {
        System.out.println("no se hace nada ya que estamos cerrados");
    }

    @Override
    public void avanzar() {
        System.out.println("no se hace nada ya que estamos cerrados");

    }
}

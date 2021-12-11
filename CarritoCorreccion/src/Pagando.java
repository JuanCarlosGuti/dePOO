import java.util.ArrayList;
import java.util.List;

public class Pagando implements EstadoCarrtio{
    private Carrito c;

    public Pagando(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto producto, List<Producto> productos) {
        System.out.println("no puede agreghar más productos ya que esta pagando");

    }

    @Override
    public void cancelar() {
        ArrayList<Producto> productos= new ArrayList<>();
        c.setEstado(new Vacio(c));
        System.out.println(" volvemos a estar vacios");

    }

    @Override
    public void volverPuntoanterior() {
        c.setEstado(new Cargando(c));
        System.out.println(" volvemos al punto anterior, Cargando");

    }

    @Override
    public void avanzar() {
        c.setEstado(new Cerrado(c));
        System.out.println("pasamos al estado Cerrado");


    }
}

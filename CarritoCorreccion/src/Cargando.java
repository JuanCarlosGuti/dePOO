import java.util.ArrayList;
import java.util.List;

public class Cargando implements EstadoCarrtio{
    private Carrito c;

    public Cargando(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto producto, List<Producto> productos) {
        productos.add(producto);
        System.out.println("estamos adicionando productos");

    }

    @Override
    public void cancelar() {
        ArrayList<Producto> productos= new ArrayList<>();
        c.setEstado(new Vacio(c));
        System.out.println(" volvemos a estar vacios");

    }

    @Override
    public void volverPuntoanterior() {
        ArrayList<Producto> productos= new ArrayList<>();
        c.setEstado(new Vacio(c));
        System.out.println(" volvemos al punto anterior");
    }

    @Override
    public void avanzar() {
        c.setEstado(new Pagando(c));
        System.out.println("Pasamos al estado Pagando");

    }


}

package estados;

import java.util.ArrayList;
import java.util.List;

public class Cargando implements EstadoCarrito{

    private Carrito c;

    public Cargando(Carrito c) {
        this.c = c;
    }

    @Override
    public void agregarProducto(Producto p, List<Producto> productos) throws ExcepcionesCarro {
        productos.add(p);

    }

    @Override
    public void cancelarCarrito() throws ExcepcionesCarro {
        this.c.setEstado(new Vacio(c));
        c.setProds(new ArrayList<>());


    }

    @Override
    public void volverPuntoAnterior() throws ExcepcionesCarro {
        this.c.setEstado(new Vacio(c));
        c.setProds(new ArrayList<>());

    }

    @Override
    public void pasarSiguiente() throws ExcepcionesCarro {
        this.c.setEstado(new Pagando(c));

    }

    @Override
    public String toString() {
        return "Cargando";
    }
}

package estados;

import java.util.ArrayList;
import java.util.List;

public class Pagando implements EstadoCarrito{
    private Carrito c;

    public Pagando(Carrito c) {
        this.c = c;
    }


    @Override
    public void agregarProducto(Producto p, List<Producto> productos) throws ExcepcionesCarro {
        throw new ExcepcionesCarro("no puede agregar productos en el estado pagando");

    }

    @Override
    public void cancelarCarrito() throws ExcepcionesCarro {
        this.c.setEstado(new Vacio(c));


    }

    @Override
    public void volverPuntoAnterior() throws ExcepcionesCarro {
        this.c.setEstado(new Cargando(c));

    }

    @Override
    public void pasarSiguiente() throws ExcepcionesCarro {
        this.c.setEstado(new Cerrado(c));
    }

    @Override
    public String toString() {
        return "Pagando";
    }
}

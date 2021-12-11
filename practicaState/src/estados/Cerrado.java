package estados;

import java.util.ArrayList;
import java.util.List;

public class Cerrado implements EstadoCarrito{
    private Carrito c;

    public Cerrado(Carrito c) {
        this.c = c;
    }


    @Override
    public void agregarProducto(Producto p, List<Producto> productos) throws ExcepcionesCarro {
        throw new ExcepcionesCarro("en el estado Cerrado no se pueden agregar carritos");

    }

    @Override
    public void cancelarCarrito() throws ExcepcionesCarro {
        throw new ExcepcionesCarro("en el estado Cerrado no se puede cancelar el carrito");

    }

    @Override
    public void volverPuntoAnterior() throws ExcepcionesCarro {
        throw new ExcepcionesCarro("en el estado Cerrado no se puede volver al punto anterior");

    }

    @Override
    public void pasarSiguiente() throws ExcepcionesCarro {
        this.c.setEstado(new Vacio(c));

    }

    @Override
    public String toString() {
        return "Cerrado";
    }
}

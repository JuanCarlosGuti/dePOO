package estados;

import java.util.ArrayList;
import java.util.List;


public class Vacio implements EstadoCarrito{
    private Carrito c;


    public Vacio(Carrito c) {
        this.c = c;
        System.out.println("Vacio");

    }


    @Override
    public void agregarProducto(Producto p, List<Producto> productos) throws ExcepcionesCarro {
        throw new ExcepcionesCarro("cuando el carro esta vacío no se le puede agregar más productos");


    }

    @Override
    public void cancelarCarrito() throws ExcepcionesCarro {
        throw new ExcepcionesCarro("no pasa nada porque el carro esta vacío");

    }


    @Override
    public void volverPuntoAnterior() throws ExcepcionesCarro{
        throw new ExcepcionesCarro("no pasa nada porque el carro esta vacío");
    }

    @Override
    public void pasarSiguiente() {

        this.c.setEstado(new Cargando(c));

    }

    @Override
    public String toString() {
        return "Vacio";
    }
}

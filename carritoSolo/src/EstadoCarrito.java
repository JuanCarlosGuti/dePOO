import java.util.ArrayList;

public interface EstadoCarrito {
    void agregarProducto(Producto p, ArrayList<Producto> productos);
    void cancelarCarrito();
    void volverPuntoAnterior();
    void pasarPuntoSiguiente();

}

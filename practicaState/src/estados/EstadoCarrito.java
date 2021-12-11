package estados;

import java.util.ArrayList;
import java.util.List;

public interface EstadoCarrito {

    void agregarProducto(Producto p, List<Producto> productos) throws ExcepcionesCarro;
    void cancelarCarrito()throws ExcepcionesCarro;
    void volverPuntoAnterior() throws ExcepcionesCarro;
    void pasarSiguiente() throws ExcepcionesCarro;



}

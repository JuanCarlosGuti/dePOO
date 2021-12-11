
import java.util.List;

public interface EstadoCarrtio {
    void agregarProducto(Producto producto, List<Producto> productos);
    void cancelar();
    void volverPuntoanterior();
    void avanzar();

}

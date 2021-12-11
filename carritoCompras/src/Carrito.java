import java.util.ArrayList;


public class Carrito {
 private SatateCarrito estado;
 private ArrayList<Producto> productos;

    public Carrito() {
        this.estado = new Vacio(this);
        this.productos = new ArrayList<>();
    }

    public SatateCarrito getEstado() {
        return estado;
    }

    public void setEstado(SatateCarrito estado) {
        this.estado = estado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }


    public void agregarProducto(Producto p) {
        productos.add(p);
        this.estado.agregarProducto();
    }


    public void cancelarCarrito() {
        this.estado.cancelarCarrito();
    }


    public void volverPuntoAnterior() {
        this.estado.volverPuntoAnterior();
    }

    public void pasarAlsiguiente() {
        this.estado.pasarAlsiguiente();

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carrito{");
        sb.append("estado=").append(estado);
        sb.append(", productos=").append(productos);
        sb.append('}');
        return sb.toString();
    }
}

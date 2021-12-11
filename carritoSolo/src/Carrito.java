import java.util.ArrayList;

public class Carrito {
    private EstadoCarrito estado;
    private ArrayList<Producto> productos;

    public Carrito() {
        this.estado = new Vacio(this);
        this.productos=new ArrayList<>();
    }

    public void agregarProducto(Producto prod){

        this.estado.agregarProducto(prod,this.productos);
    }

    public void cancelarCarrito(){
        this.estado.cancelarCarrito();
    }

    public void volverAnterior(){
        this.estado.volverPuntoAnterior();
    }
    public void pasarAlSiguiente(){
        this.estado.pasarPuntoSiguiente();

    }

    public EstadoCarrito getEstado() {
        return estado;
    }

    public void setEstado(EstadoCarrito estado) {
        this.estado = estado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "estado=" + estado +
                ", productos=" + productos +
                '}';
    }
}

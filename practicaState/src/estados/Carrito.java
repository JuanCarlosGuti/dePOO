package estados;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> prods = new ArrayList<>() ;
    private EstadoCarrito estado;

    public Carrito() {
        this.estado = new Vacio(this);


    }


    void agregarProducto(Producto p) throws ExcepcionesCarro{
        this.estado.agregarProducto(p,prods);
    }
    void cancelarCarrito()throws ExcepcionesCarro{
        this.estado.cancelarCarrito();
    }
    void volverPuntoAnterior() throws ExcepcionesCarro{
        this.estado.volverPuntoAnterior();
    }
    void pasarSiguiente() throws ExcepcionesCarro {

        this.estado.pasarSiguiente();
        System.out.println( "pasó ha estado = "+estado.toString());
    }

    public List<Producto> getProds() {
        return prods;
    }

    public void setProds(List<Producto> prods) {
        this.prods = prods;
    }

    public EstadoCarrito getEstado() {
        return estado;
    }

    public void setEstado(EstadoCarrito estado) {
        this.estado = estado;
    }
}

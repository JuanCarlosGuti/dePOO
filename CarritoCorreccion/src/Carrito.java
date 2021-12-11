
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Carrito {
    private List<Producto> productos=new ArrayList<>();
    private EstadoCarrtio estado;

    public Carrito() {

        this.estado = new Vacio(this);
    }

    public void agregarProducto(Producto p){

        this.estado.agregarProducto(p, productos);

    }

    public void cancelar(){
        this.estado.cancelar();

    }
    public void volverPuntoanterior() {
        this.estado.volverPuntoanterior();


    }


    public void avanzar() {
        this.estado.avanzar();
    }


    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public EstadoCarrtio getEstado() {
        return estado;
    }

    public void setEstado(EstadoCarrtio estado) {
        this.estado = estado;
    }



    @Override
    public String toString() {
        return "productos: "+productos+'\n'+
                " Estado: "+estado;

    }
}

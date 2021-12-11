package paquete;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS =20;

    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        this.productos= new Producto[Orden.MAX_PRODUCTOS];

    }
    public void agregarProducto(Producto producto){
        if(contadorProductos<MAX_PRODUCTOS){
            productos[contadorProductos++]=producto;
        }else {
            System.out.println("Se ha superado la cantidad maxima de productos "+Orden.MAX_PRODUCTOS);
        }

    }
    public double calcularTotal(){
        double Total =0;
        for (int i=0;i<this.contadorProductos;i++){

            Total+=productos[i].getPrecio();
        }
        return Total;
    }
        public void mostrarOrden(){
            System.out.println("id Orden: "+this.idOrden);
            System.out.println("Total de la orden: "+this.calcularTotal());
            System.out.println("productos de la orden");
            for (int i=0; i<this.contadorProductos;i++){
                System.out.println(this.productos[i]);
            }
        }


}

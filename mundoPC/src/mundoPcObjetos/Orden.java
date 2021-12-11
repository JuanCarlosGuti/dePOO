package mundoPcObjetos;

public class Orden {

    private final int idOrden;
    private Computador computador[];
    private static int contadorOrdenes;
    private  int contadorComputadores;
    private final static int MAX_COMPUTADORES=20;

    public Orden() {
        this.idOrden =++ Orden.contadorOrdenes;
        this.computador = new Computador[Orden.MAX_COMPUTADORES];
    }
    public void agregarComputador(Computador computador){
        if (this.contadorComputadores<Orden.MAX_COMPUTADORES){
            this.computador[this.contadorComputadores++]=computador;
        }else {
            System.out.println("haz superado el limite "+Orden.MAX_COMPUTADORES);
        }
    }
    public void mostrarOrden(){
        System.out.println("orden: "+this.idOrden);
        System.out.println("Computadores de la Orden");
        for (int i=0; i<this.contadorComputadores;i++){
            System.out.println(computador[i]);
        }
    }
}

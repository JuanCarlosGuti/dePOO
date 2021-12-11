package Navetur;


public class Yates extends Embarcacion implements Comparable{

    private int cantidadCamarates;

    public Yates(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, int longitudSlora, int cantidadCamarates) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, longitudSlora);
        this.cantidadCamarates = cantidadCamarates;
    }

    public int nivelDeLujo(){
        return this.cantidadCamarates;
    }

    public int getCantidadCamarates() {
        return cantidadCamarates;
    }

    public void setCantidadCamarates(int cantidadCamarates) {
        this.cantidadCamarates = cantidadCamarates;
    }


    @Override
    public int compareTo(Object o) {
        Yates yate=(Yates) o;
        int respuesta =0;
        if(this.getCantidadCamarates()>yate.getCantidadCamarates())
            respuesta=1;
        if (this.getCantidadCamarates()>yate.getCantidadCamarates())
            respuesta=-1;

        return respuesta;
    }
}

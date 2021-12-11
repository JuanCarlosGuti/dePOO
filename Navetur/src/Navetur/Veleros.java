package Navetur;

public class Veleros extends Embarcacion{

    private int cantidadMastiles;

    public Veleros(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, int longitudSlora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, longitudSlora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public int getCantidadMastiles() {
        return cantidadMastiles;
    }

    public void setCantidadMastiles(int cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean esGrande() {
       return this.cantidadMastiles > 4;
    }
}

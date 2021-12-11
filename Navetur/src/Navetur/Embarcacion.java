package Navetur;

public class Embarcacion {

    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private int longitudSlora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, int longitudSlora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.longitudSlora = longitudSlora;
    }
    public double calcularAlquiler(){
        if (this.anioFabricacion<2020){
            return this.precioBase;
        } return this.precioBase+this.valorAdicional;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getLongitudSlora() {
        return longitudSlora;
    }

    public void setLongitudSlora(int longitudSlora) {
        this.longitudSlora = longitudSlora;
    }
}


public class Reparacion  {

    private EstadoReparacion estado;
    private String NombreArticulo;
    private double valorDePresupuesto;
    private String direccionEntrega;

    public Reparacion( String nombreArticulo) {
        setEstado(FactoryEstado.getInstance().getEstado("EnPresupuesto", this));
        NombreArticulo = nombreArticulo;
    }
    void cambiarDireccion(String d) throws ExcepcionesDeReparacion{
     this.estado.cambiarDireccion(d);
    }
    void darValorPresupuesto(double v) throws ExcepcionesDeReparacion{
        this.estado.darValorPresupuesto(v);
    }
    void agregarRepuestos(double v) throws ExcepcionesDeReparacion{
        this.estado.agregarRepuestos(v);
    }
    void siguientePaso() throws ExcepcionesDeReparacion{
        this.estado.siguientePaso();
        System.out.println("-----------------------------------------\n" +
                           "-------------CAMBIO DE ESTADO------------\n" +

                           "Reparacion" +"\n"+
                           "estado            = " + estado +"\n"+
                           "NombreArticulo    = " + NombreArticulo + '\n' +
                           "valorDePresupuesto= " + valorDePresupuesto +'\n'+
                           "direccionEntrega  = " + direccionEntrega + '\n'+
                           "_________________________________________\n");

    }

    public EstadoReparacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoReparacion estado) {
        this.estado = estado;
    }

    public String getNombreArticulo() {
        return NombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        NombreArticulo = nombreArticulo;
    }

    public double getValorDePresupuesto() {
        return valorDePresupuesto;
    }

    public void setValorDePresupuesto(double valorDePresupuesto) {
        this.valorDePresupuesto = valorDePresupuesto;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    @Override
    public String toString() {
        return  "-----------------------------------------\n" +
                "-----------------------------------------\n"+
                "Reparacion" +"\n"+
                "estado            = " + estado +"\n"+
                "NombreArticulo    = " + NombreArticulo + '\n' +
                "valorDePresupuesto= " + valorDePresupuesto +'\n'+
                "direccionEntrega  = " + direccionEntrega + '\n'+
                "_________________________________________"+"\n"+
                "_________________________________________";
    }
    public void mostrar(){
        System.out.println("Articulo   : "+this.getNombreArticulo());
        System.out.println("Presupuesto: "+this.getValorDePresupuesto());
        System.out.println("Direccion  : "+this.getDireccionEntrega());
        System.out.println("==========================================");
    };
}

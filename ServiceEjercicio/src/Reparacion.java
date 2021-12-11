public class Reparacion {

    private StateReparacion estado;
    private String nombreArticulo;
    private double costo;
    private String direccionenvio;

    public Reparacion( String nombreArticulo) {
        this.estado = new Presupuesto(this);
        this.nombreArticulo = nombreArticulo;

    }

    public void cambiarDireccion(String d) throws Exception {
        this.estado.cambiarDireccion(d);


    }
    public void darValorPresupuesto(double valor) throws Exception{
        this.estado.darValorPresupuesto(valor);


    }
    public void agregarRepuestos(double valor) throws Exception{
        this.estado.agregarRepuestos(valor);


    }

    public StateReparacion getEstado() {
        return estado;
    }

    public void setEstado(StateReparacion estado) {
        this.estado = estado;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDireccionenvio() {
        return direccionenvio;
    }

    public void setDireccionenvio(String direccionenvio) {
        this.direccionenvio = direccionenvio;
    }



    public void siguientePaso() throws Exception{
        this.estado.siguientePaso();
        System.out.println("cambio de estado");
        System.out.println( "nombre articulo = "+nombreArticulo+" \n" +
                            "estado          = "+estado+"\n" +
                            "Presupuesto     = "+costo+"\n" +
                            "direccion envio = "+direccionenvio+"\n" +
                            "==========================================");





    }

    @Override
    public String toString() {
        return "Reparacion{" +
                "estado=" + estado +
                ", nombreArticulo='" + nombreArticulo + '\'' +
                ", costo= " + costo +
                ", direccionenvio='" + direccionenvio + '\'' +
                '}';
    }
}

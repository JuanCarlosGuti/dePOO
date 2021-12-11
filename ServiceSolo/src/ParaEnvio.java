public class ParaEnvio implements EstadoReparacion{
    private Reparacion reparacion;

    public ParaEnvio(Reparacion reparacion) {
        this.reparacion = reparacion;
        System.out.println("Para envio");
        reparacion.mostrar();
    }

    @Override
    public void cambiarDireccion(String d) throws ExcepcionesDeReparacion {
        reparacion.setDireccionEntrega(d);

    }

    @Override
    public void darValorPresupuesto(double v) throws ExcepcionesDeReparacion {
        throw new ExcepcionesDeReparacion("no se puede dar valor de presupuesto porque esta en para envio");

    }

    @Override
    public void agregarRepuestos(double v) throws ExcepcionesDeReparacion {
        throw new ExcepcionesDeReparacion("no se puede agregar repuestos porque esta en para envio");

    }

    @Override
    public void siguientePaso() throws ExcepcionesDeReparacion {
        reparacion.setEstado(FactoryEstado.getInstance().getEstado("Finalizada",reparacion));


    }
    @Override
    public String toString() {
        return "Para envio";
    }
}

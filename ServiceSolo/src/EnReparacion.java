public class EnReparacion implements EstadoReparacion{
    private Reparacion reparacion;

    public EnReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
        System.out.println("En reparación");
        reparacion.toString();
    }



    @Override
    public void cambiarDireccion(String d) throws ExcepcionesDeReparacion {
        throw new ExcepcionesDeReparacion("no se puede cambiar dirección en reparación");

    }

    @Override
    public void darValorPresupuesto(double v) throws ExcepcionesDeReparacion {
        throw new ExcepcionesDeReparacion("no se puede dar valor de presupuesto porque esta en reparación");

    }

    @Override
    public void agregarRepuestos(double v) throws ExcepcionesDeReparacion {
        reparacion.setValorDePresupuesto(reparacion.getValorDePresupuesto()+v);

    }

    @Override
    public void siguientePaso() throws ExcepcionesDeReparacion {
        reparacion.setEstado(FactoryEstado.getInstance().getEstado("ParaEnvio",reparacion));

    }
    @Override
    public String toString() {
        return "En reparación";
    }
}

public class EnPresupuesto implements EstadoReparacion{
    private Reparacion reparacion;


    public EnPresupuesto(Reparacion reparacion) {
        this.reparacion = reparacion;
        System.out.println("En presupuesto");
        reparacion.mostrar();
    }

    @Override
    public void cambiarDireccion(String d) throws ExcepcionesDeReparacion {
        throw new ExcepcionesDeReparacion("no se puede cambiar dirección en presupuesto");

    }

    @Override
    public void darValorPresupuesto(double v) throws ExcepcionesDeReparacion {
        reparacion.setValorDePresupuesto(v);

    }

    @Override
    public void agregarRepuestos(double v) throws ExcepcionesDeReparacion {
        throw new ExcepcionesDeReparacion("no podemos agregar repuestos porque esta en reparación");

    }

    @Override
    public void siguientePaso() throws ExcepcionesDeReparacion {
        reparacion.setEstado(FactoryEstado.getInstance().getEstado("EnReparacion",reparacion));



    }

    @Override
    public String toString() {
        return "En presupuesto";
    }
}

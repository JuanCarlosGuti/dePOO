public class Finalizado implements EstadoReparacion{
    public Reparacion reparacion;

    public Finalizado(Reparacion reparacion) {
        this.reparacion = reparacion;
        System.out.println("Finalizado");
        reparacion.mostrar();
    }

    @Override
    public void cambiarDireccion(String d) throws ExcepcionesDeReparacion {
        throw new ExcepcionesDeReparacion("no se puede cambiar dirección en finalizado");

    }

    @Override
    public void darValorPresupuesto(double v) throws ExcepcionesDeReparacion {
        throw new ExcepcionesDeReparacion("no se puede cambiar dar valor presupuesto en finalizado");

    }

    @Override
    public void agregarRepuestos(double v) throws ExcepcionesDeReparacion {
        throw new ExcepcionesDeReparacion("no se puede agregar repuestos en finalizado");

    }

    @Override
    public void siguientePaso() throws ExcepcionesDeReparacion {
        throw new ExcepcionesDeReparacion("no se puede cambiar de estado porque la repación ha finalizado");

    }
    @Override
    public String toString() {
        return "Finalizado";
    }
}

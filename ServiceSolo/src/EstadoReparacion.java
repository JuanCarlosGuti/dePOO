public interface EstadoReparacion {

    void cambiarDireccion(String d) throws ExcepcionesDeReparacion;
    void darValorPresupuesto(double v) throws ExcepcionesDeReparacion;
    void agregarRepuestos(double v) throws ExcepcionesDeReparacion;
    void siguientePaso() throws ExcepcionesDeReparacion;
}

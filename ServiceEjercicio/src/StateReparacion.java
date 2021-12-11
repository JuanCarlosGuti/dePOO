public interface StateReparacion {

    void cambiarDireccion(String d) throws Exception;
    void darValorPresupuesto(double valor) throws Exception;
    void agregarRepuestos(double valor) throws Exception;
    void siguientePaso() throws Exception;


}

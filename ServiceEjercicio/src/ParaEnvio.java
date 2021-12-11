public class ParaEnvio implements StateReparacion{

    private Reparacion r;

    public ParaEnvio(Reparacion r) {
        this.r = r;
    }

    @Override
    public void cambiarDireccion(String d) {
        r.setDireccionenvio(d);


    }

    @Override
    public void darValorPresupuesto(double valor) {

    }

    @Override
    public void agregarRepuestos(double valor) {

    }

    @Override
    public void siguientePaso() {

    }
    @Override
    public String toString() {
        return "Para envio";
    }
}

public class Finalizado implements StateReparacion{

    private Reparacion r;

    public Finalizado(Reparacion r) {
        this.r = r;
    }


    @Override
    public void cambiarDireccion(String d) {

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
        return "Reparación finalizada";
    }
}

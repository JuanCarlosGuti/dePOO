public class Presupuesto implements StateReparacion{

    private Reparacion r;

    public Presupuesto(Reparacion r) {
        this.r = r;
    }

    @Override
    public void cambiarDireccion(String d) throws Exception {
        throw new Exception("no se puede cambiar dirección en Presupuesto");

      }

    @Override
    public void darValorPresupuesto(double valor) throws Exception {
        r.setCosto(valor);




    }

    @Override
    public void agregarRepuestos(double valor) throws Exception {
        throw new Exception(" no puede agregar respuestos porque esta en presupuesto");

    }

    @Override
    public void siguientePaso() throws Exception{
        r.setEstado(new EnReparacion(r));

    }
    @Override
    public String toString() {
        return "En Presupuesto";
    }
}

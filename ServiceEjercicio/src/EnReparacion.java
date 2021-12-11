public class EnReparacion implements StateReparacion{
 private Reparacion r;



    public EnReparacion(Reparacion r) {
        this.r = r;
    }

    @Override
    public void cambiarDireccion(String d) throws Exception{
        throw new Exception("no se puede cambiar la dirección en reparación");


    }

    @Override
    public void darValorPresupuesto(double valor) throws Exception{
        throw new Exception("no puede asignar presupuesto en dar valor al presupuesto");



    }

    @Override
    public void agregarRepuestos(double valor) {
       r.setCosto(r.getCosto()+valor);


    }

    @Override
    public void siguientePaso() {
       r.setEstado(new ParaEnvio(r));
    }

   @Override
   public String toString() {
      return "En reparación";
   }
}

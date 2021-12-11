public class FactoryEstado {
    private static FactoryEstado instancia;

    private FactoryEstado() {
    }

    public static FactoryEstado getInstance() {
        if (instancia==null)
            instancia=new FactoryEstado();

        return instancia;

    }


    public EstadoReparacion getEstado(String tipo, Reparacion reparacion){
        switch (tipo){
            case "EnPresupuesto":
                return new EnPresupuesto(reparacion);
            case "EnReparacion":
                return new EnReparacion(reparacion);
            case "ParaEnvio":
                return new ParaEnvio(reparacion);
            case "Finalizada":
                return new Finalizado(reparacion);
            default:
                System.out.println("no se encuentra ese codio");
                return null;

        }

    }

}

public class Main {
    public static void main(String[] args)  {

        Reparacion reparacion= new Reparacion("batidora");

        try {
            reparacion.darValorPresupuesto(3000);


            reparacion.darValorPresupuesto(3000);
            reparacion.siguientePaso();
            reparacion.agregarRepuestos(620);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println(reparacion);






    }
}

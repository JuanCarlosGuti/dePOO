package banco;

import clientes.Cliente;
import clientes.ClienteWeb;
import clientes.clienteTienda;

public class Main {
    private static Object Cuentas;

    public static void main(String[] args) {
        Cliente cliente1= new Cliente(85,"garcia",56,569874);

        Cuentas cuenta2 = new Cuentas() {
            @Override
            public void extraer(double monto) {

            }
        };
        Cuentas cuenta = new CajaAhorro(560,.2,cliente1);
       Cuentas cuenta1= new Comitente(860);
       cuenta1=new CuentaCorriente(895,150);

        System.out.println(((CuentaCorriente)cuenta1).getMontoAutorizado());






       Cliente client=new clienteTienda(89,"garcia",8976,456789,"colombia","calle22");
       Cliente cliente2=new ClienteWeb(789,"gonzalez",89456,564,"gota3","peru");



    }
}

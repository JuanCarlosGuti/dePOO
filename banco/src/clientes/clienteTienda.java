package clientes;

import banco.Cuentas;
import clientes.Cliente;

public class clienteTienda extends Cliente {
    private String pais;
    private String direccion;


    public clienteTienda(int numeroCliente, String apellido, int DNI, int CUIT, String pais, String direccion) {
        super(numeroCliente, apellido, DNI, CUIT);
        this.pais = pais;
        this.direccion = direccion;
    }

    @Override
    public void informarDatos() {
        super.informarDatos();
        System.out.println(this.direccion);
    }
    public void hacerDevolucion(){
        System.out.println(" solo los clientes grandes pueden hacer devolucines");

            }
}

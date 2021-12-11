package banco;

import clientes.Cliente;

public class CuentaCorriente extends Cuentas {

    private double montoAutorizado;
    private Cliente cliente;


    public CuentaCorriente(double saldo, double montoAutorizado) {
        super(saldo);
        this.montoAutorizado = montoAutorizado;
        this.cliente=cliente;
    }

    public CuentaCorriente(int saldo) {
    }

    public double getMontoAutorizado() {
        return montoAutorizado;
    }

    public void setMontoAutorizado(double montoAutorizado) {
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void extraer(double monto) {
        if ((informarSaldo()+this.montoAutorizado)>=monto){
            setSaldo(informarSaldo()-monto);
        }else {
            System.out.println("excede su monto autorizado");
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CuentaCorriente{");
        sb.append("montoAutorizado= ").append(montoAutorizado);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }


}

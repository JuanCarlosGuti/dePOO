package banco;

import clientes.Cliente;

public class CajaAhorro extends Cuentas{

    private double tasa;
    private Cliente cliente;

    public CajaAhorro(double saldo, double tasa,Cliente cliente) {
        super(saldo);
        this.tasa = tasa;
        this.cliente=cliente;
    }



    @Override
    public void extraer(double monto) {
            if (getSaldo()>=monto){
                setSaldo(getSaldo()-monto);
            }else {
                System.out.println("el saldo no es suficiente");
            }
    }

    public double cobrarInteres(){
        return informarSaldo()*tasa;
    }


    @Override
    public void depositar(double monto) {
        setSaldo(getSaldo()+(monto*1.01));
        System.out.println("su de posito fue de "+monto+" su nuevo saldo en su\n caja de ahorro es "+getSaldo());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CajaAhorro{");
        sb.append(super.toString());
        sb.append("tasa=").append(tasa);
        sb.append(", cliente=").append(cliente);
        sb.append('}');
        return sb.toString();
    }
}


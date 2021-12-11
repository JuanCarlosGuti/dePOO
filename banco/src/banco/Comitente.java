package banco;

public class Comitente extends Cuentas {
    private String Clavevalidacion;

    public Comitente(double saldo) {
        super(saldo);
    }

    @Override
    public void extraer(double monto) {
       if (getSaldo()/2<=monto){
           setSaldo(informarSaldo()-monto);
           System.out.println("operacion exitosa  su nuevo saldo es "+informarSaldo());
       }else {
           System.out.println("no se puede realizar la operación");

       }


    }


    public void extraer(double monto, String clavevalidacion) {
        if(this.Clavevalidacion.equals(clavevalidacion)){
            if (informarSaldo()>=monto){
                setSaldo(getSaldo()-monto);
                System.out.println("operacion exitosa  su nuevo saldo es "+informarSaldo());
            }else {
                System.out.println("no se puede realizar la operacion fondos insuficientes");
            }
        }


    }

    @Override
    public double informarSaldo() {
        return super.informarSaldo();

    }

    public void depositar(double monto){
        setSaldo(getSaldo() + (monto * .99));
        System.out.println("su de posito fue de "+monto+" su nuevo saldo en su\n cuenta comitente es"+getSaldo());


    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comitente{");
        sb.append(super.toString());
        sb.append("Clavevalidacion='").append(Clavevalidacion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

package banco;

public abstract class Cuentas {
   private double saldo;

   public Cuentas() {

   }

   public void depositar(double monto){
      this.saldo+=monto;
      System.out.println(" se deposito a su cuenta "+monto+" su nuevo saldo es "+getSaldo());
   }


   public abstract void extraer(double monto);

   public double informarSaldo(){
      return this.saldo;
   }

   public Cuentas(double saldo) {
      this.saldo = saldo;
   }

   public double getSaldo() {
      return saldo;
   }

   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }

   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("Cuentas{");
      sb.append("saldo= ").append(saldo);
      sb.append('}');
      return sb.toString();
   }
}

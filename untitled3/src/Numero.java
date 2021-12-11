public class Numero {


    private int numeroDeCuenta;
    private Double saldo;

    //crear la funcion depositar y retirar aca
    public Double deposito(Double cantidadDedinero) {
        this.saldo += saldo;
        return saldo;
    }
    public void retiro(Double cantidadDedinero) {
        this.saldo -= saldo;
    }


    //no tocar estas funciones
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }
}

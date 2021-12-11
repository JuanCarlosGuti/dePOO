public class Cliente {
private Integer numeroCliente;
private String nombre;
private Double deuda;

public Cliente(int numero, String nombre){
    numeroCliente=numero;
    this.nombre = nombre;
    this.deuda=0.;
}

public void incrementarDeuda(Double valor){
    this.deuda+=valor;
    System.out.println("Deuda aumentada a "+ this.deuda);

}

public void pagarDeuda(){
    if(this.deuda>0.){
        this.deuda=0.;
        System.out.println(this.nombre+" ha pagado las deudas");
    }else {
        System.out.println(this.nombre+" ya pago hace rato");
    }
}



}


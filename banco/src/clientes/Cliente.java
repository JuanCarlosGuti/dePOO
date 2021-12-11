package clientes;

public class Cliente {

    private int numeroCliente;
    private String apellido;
    private int DNI;
    private int CUIT;



    public Cliente(int numeroCliente, String apellido, int DNI, int CUIT) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.DNI = DNI;
        this.CUIT = CUIT;
    }

    public void informarDatos(){
        System.out.println(this.apellido);
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getCUIT() {
        return CUIT;
    }

    public void setCUIT(int CUIT) {
        this.CUIT = CUIT;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("numeroCliente=").append(numeroCliente);
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", DNI=").append(DNI);
        sb.append(", CUIT=").append(CUIT);
        sb.append('}');
        return sb.toString();
    }
}

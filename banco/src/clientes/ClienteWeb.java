package clientes;

public class ClienteWeb extends Cliente{
        private String usuarioWeb;
        private String pais;

    public ClienteWeb(int numeroCliente, String apellido, int DNI, int CUIT, String usuarioWeb, String pais) {
        super(numeroCliente, apellido, DNI, CUIT);
        this.usuarioWeb = usuarioWeb;
        this.pais = pais;
    }

    @Override
    public void informarDatos() {
        super.informarDatos();
        System.out.println(this.usuarioWeb+" "+this.pais);
    }
}

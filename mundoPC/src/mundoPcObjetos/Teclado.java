package mundoPcObjetos;

public class Teclado extends DispositivosEntrada {
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado=++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teclado{");
        sb.append(super.toString());
        sb.append("idTeclado=").append(idTeclado);
        sb.append('}');
        return sb.toString();
    }
}

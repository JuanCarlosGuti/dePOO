package mundoPcObjetos;

public class Raton extends DispositivosEntrada{
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton=++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raton{");
        sb.append(super.toString());
        sb.append("idRaton=").append(idRaton);
        sb.append('}');
        return sb.toString();
    }
}

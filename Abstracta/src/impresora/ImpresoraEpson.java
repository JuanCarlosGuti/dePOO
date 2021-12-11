package impresora;

public class ImpresoraEpson extends Impresora{

    public ImpresoraEpson(String modelo, String tipoConexion, String fechaFabricacion, int hojasDisponibles, double porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }

    public ImpresoraEpson() {

    }

    @Override
    public String imprimir(){
        return "Imprimiendo como Epson";
    }

}

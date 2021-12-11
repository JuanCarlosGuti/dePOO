package impresora;

public class ImpresoraCanon extends Impresora {

    public ImpresoraCanon(String modelo, String tipoConexion, String fechaFabricacion, int hojasDisponibles, double porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }
    public ImpresoraCanon(){}
    @Override
    public String imprimir(){
        return "Imprimiendo como Canon";
    }
    public void apagar(){
        System.out.println("apagando impresora Canon");
    }
}

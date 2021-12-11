package impresora;

public abstract class Impresora {
    private String modelo;
    private String tipoConexion;
    private String fechaFabricacion;
    private int hojasDisponibles;
    private double porcentajeTinta;

    public Impresora(){}

    public Impresora(String modelo, String tipoConexion, String fechaFabricacion, int hojasDisponibles, double porcentajeTinta) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.hojasDisponibles = hojasDisponibles;
        this.porcentajeTinta = porcentajeTinta;
    }

    public boolean tienePapel(){
        return this.hojasDisponibles > 0;
    }
    public boolean necesitaTinta(){
        return this.porcentajeTinta < 5.;
    }
    //Contrato a ser heredado
    public abstract String imprimir();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public double getPorcentajeTinta() {
        return porcentajeTinta;
    }

    public void setPorcentajeTinta(double porcentajeTinta) {
        this.porcentajeTinta = porcentajeTinta;
    }
}










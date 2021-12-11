package propiedades;

public abstract class PropiedadesMunicipio {
    private String calle;
    private String numero;

    public PropiedadesMunicipio() {
    }

    public PropiedadesMunicipio(String calle, String numero) {
        this.calle = calle;
        this.numero = numero;
    }



    public abstract double calcularImpuesto();

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}

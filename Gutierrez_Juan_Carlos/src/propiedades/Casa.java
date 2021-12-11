package propiedades;

public class Casa extends PropiedadesMunicipio {
    private double montoImpuesto;

    public Casa() {
    }

    public Casa(String calle, String numero, double montoImpuesto) {
        super(calle, numero);
        this.montoImpuesto = montoImpuesto;
    }

    @Override
    public double calcularImpuesto() {

        if(getCalle()=="Av. San Martin"){
           return this.montoImpuesto*1.1;
        }else {

        }return this.montoImpuesto;

        }

    public double getMontoImpuesto() {
        return montoImpuesto;
    }

    public void setMontoImpuesto(double montoImpuesto) {
        this.montoImpuesto = montoImpuesto;
    }
}

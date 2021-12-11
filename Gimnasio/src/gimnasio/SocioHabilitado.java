package gimnasio;

public class SocioHabilitado extends Socio{
    private Double costoPileta;
    private boolean habilitado;

    public SocioHabilitado(String numero, String nombre, String actividad, Double cuota, Double costoPileta) {
        super(numero, nombre, actividad, cuota);
        this.costoPileta = costoPileta;
    }
    //Sobreescritura de métodos

    @Override
    public Double getCostoTotal(){
        if(this.isHabilitado()) {
            return getCuotaMensual() + this.getCostoPileta();
        }else{
            return super.getCuotaMensual();
        }
    }

    public Double getCostoPileta() {
        return costoPileta;
    }

    public void setCostoPileta(Double costoPileta) {
        this.costoPileta = costoPileta;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public String toString() {
        return super.toString()+
                "SocioHabilitado{" +
                "costoPileta=" + costoPileta +
                ", habilitado=" + habilitado +
                '}';
    }
}

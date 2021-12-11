package Titulos;

public class Licenciatura extends Titulos implements Comparable {
 private String temaTesis;
 private String fechaEntrega;
 private int cantidaInvestigacion;

    public Licenciatura(int cantidadMaterias, String fechaInicio, String fechaFinal, boolean selladoMinisterio, boolean selladoInstituto, Personas personas, String temaTesis, String fechaEntrega, int cantidaInvestigacion) {
        super(cantidadMaterias, fechaInicio, fechaFinal, selladoMinisterio, selladoInstituto, personas);
        this.temaTesis = temaTesis;
        this.fechaEntrega = fechaEntrega;
        this.cantidaInvestigacion = cantidaInvestigacion;
    }



    public String getTemaTesis() {
        return temaTesis;
    }

    public void setTemaTesis(String temaTesis) {
        this.temaTesis = temaTesis;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getCantidaInvestigacion() {
        return cantidaInvestigacion;
    }
    @Override
    public int compareTo(Object o) {
        Licenciatura licenciatura= (Licenciatura) o;
        int respuesta=0;
        if(this.getCantidaInvestigacion()> licenciatura.getCantidaInvestigacion()){
            respuesta=1;
        }else if(this.getCantidaInvestigacion()< licenciatura.getCantidaInvestigacion()){
            respuesta=-1;
        }
        return respuesta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Licenciatura{");
        sb.append(super.toString());
        sb.append("temaTesis='").append(temaTesis).append('\'');
        sb.append(", fechaEntrega='").append(fechaEntrega).append('\'');
        sb.append(", cantidaInvestigacion=").append(cantidaInvestigacion);
        sb.append('}');
        return sb.toString();
    }
}

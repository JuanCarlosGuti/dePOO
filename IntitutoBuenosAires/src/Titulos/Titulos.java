package Titulos;


public abstract class  Titulos {

    private int cantidadMaterias;
    private String fechaInicio;
    private String fechaFinal;
    private boolean selladoMinisterio;
    private boolean selladoInstituto;
    private Personas personas;

    public Titulos(int cantidadMaterias, String fechaInicio, String fechaFinal, boolean selladoMinisterio, boolean selladoInstituto, Personas personas) {
        this.cantidadMaterias = cantidadMaterias;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.selladoMinisterio = selladoMinisterio;
        this.selladoInstituto = selladoInstituto;
        this.personas = personas;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    public int getCantidadMaterias() {
        return cantidadMaterias;
    }

    public void setCantidadMaterias(int cantidadMaterias) {
        this.cantidadMaterias = cantidadMaterias;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public boolean isSelladoMinisterio() {
        return selladoMinisterio;
    }

    public void setSelladoMinisterio(boolean selladoMinisterio) {
        this.selladoMinisterio = selladoMinisterio;
    }

    public boolean isSelladoInstituto() {
        return selladoInstituto;
    }

    public void setSelladoInstituto(boolean selladoInstituto) {
        this.selladoInstituto = selladoInstituto;
    }

    public boolean puedeEjercer(){
        if(this.selladoMinisterio&&this.selladoInstituto){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Titulos{");
        sb.append("cantidadMaterias=").append(cantidadMaterias);
        sb.append(", fechaInicio='").append(fechaInicio).append('\'');
        sb.append(", fechaFinal='").append(fechaFinal).append('\'');
        sb.append(", selladoMinisterio=").append(selladoMinisterio);
        sb.append(", selladoInstituto=").append(selladoInstituto);
        sb.append(", personas=").append(personas);
        sb.append('}');
        return sb.toString();
    }
}

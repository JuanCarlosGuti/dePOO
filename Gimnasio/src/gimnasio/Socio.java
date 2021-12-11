package gimnasio;

public class Socio {
    private String numeroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;

    public Socio(String numero, String nombre, String actividad, Double cuota ){
        this.numeroSocio = numero;
        this.nombre = nombre;
        this.actividad = actividad;
        this.cuotaMensual = cuota;
    }

    public Double getCostoTotal(){
        return this.getCuotaMensual();
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(Double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "numeroSocio='" + numeroSocio + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cuotaMensual=" + cuotaMensual +
                ", actividad='" + actividad + '\'' +
                '}';
    }
}

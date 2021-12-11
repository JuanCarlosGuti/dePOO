public class Fundacion {

    private boolean adopcion;
    private String raza;
    private Integer anioNacimiento;
    private double peso;
    private boolean tieneChip;
    private boolean estaLastimado;
    private String nombre;

    public Fundacion(String nombre, String raza, Integer anioNacimiento){
        this.nombre=nombre;
        this.raza = raza;
        this.anioNacimiento=anioNacimiento;
    }
    public Fundacion(String nombre, String raza, Integer anioNacimiento,boolean adopcion,double peso,
                     boolean tieneChip, boolean estaLastimado){
        this.nombre=nombre;
        this.raza = raza;
        this.anioNacimiento=anioNacimiento;
        this.adopcion=adopcion;
        this.peso =peso;
        this.tieneChip =tieneChip;
        this.estaLastimado=estaLastimado;

    }

    public String preguntarEdadYChip(){
        int edad = 2021-anioNacimiento;
        String sePierde = tieneChip ? " no es propenso a perderse " : " es propenso a perderse";
        return ("el perro tiene "+edad+" años "+sePierde);
    }

    public boolean isAdopcion() {
        return adopcion;
    }

    public void setAdopcion(boolean adopcion) {
        this.adopcion = adopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(Integer anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public boolean isEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

package dominio;

public class PersonaCol {
    private double salario;
    private String apellido;
    private String nombre;
    private boolean trabajando;

    public PersonaCol(double salario, String apellido, String nombre, boolean trabajando) {
        this.salario = salario;
        this.apellido = apellido;
        this.nombre = nombre;
        this.trabajando = trabajando;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTrabajando() {
        return trabajando;
    }

    public void setTrabajando(boolean trabajando) {
        this.trabajando = trabajando;
    }

    public String toString(){
        return "persona-- nombre "+this.nombre+" "+this.apellido+
                "\n sueldo: "+this.salario+
                "\n  trabajando: "+this.trabajando;
    }
}

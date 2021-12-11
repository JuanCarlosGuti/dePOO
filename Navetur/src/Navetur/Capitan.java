package Navetur;

public class Capitan {

    private String nombre;
    private String apellido;
    private int matriculaNavegacion;

    public Capitan(String nombre, String apellido, int matriculaNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMatriculaNavegacion() {
        return matriculaNavegacion;
    }

    public void setMatriculaNavegacion(int matriculaNavegacion) {
        this.matriculaNavegacion = matriculaNavegacion;
    }
}

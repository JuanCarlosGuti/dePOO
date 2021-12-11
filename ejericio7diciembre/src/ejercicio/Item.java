package ejercicio;

public abstract class Item {
    private String nombre;


    abstract double calcularPrecio();
    abstract String mostrarDatos();

    public Item(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

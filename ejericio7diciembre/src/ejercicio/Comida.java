package ejercicio;

public class Comida extends Item {

private double precio;

    public Comida(String nombre, double precio) {
        super(nombre);
        this.precio = precio;
    }

    @Override
    double calcularPrecio() {
        return 0;
    }

    @Override
    String mostrarDatos() {
        return null;
    }
}

public class Rectangulo implements Figura{
    private double largo;
    private double alto;

    public Rectangulo(double largo, double alto) {
        this.largo = largo;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return largo*alto;

    }


}

package domain;

public class Rectangulo extends Figurageometrica{

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("se imprime "+this.getClass().getSimpleName());

    }
}

public class Nave extends Objeto {
    private Double velocidad;
    private Integer vida;

    public Nave (Integer x, Integer y, char direccion, Double velocidad) {
        super(x, y, direccion);
        this.velocidad = velocidad;
    }

    @Override
    public void irA (Integer x, Integer y, char direccion) {
        if (getDireccion() != direccion) {
            this.girar(direccion);
        }
        setPosx(x);
        setPosy(y);
    }

    public void girar(char direccion) {
        setDireccion(direccion);
    }

    public void restaVida (Integer valor) {
        return;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }
}

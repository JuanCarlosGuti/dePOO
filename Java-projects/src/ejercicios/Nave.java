package ejercicios;

public class Nave extends Objeto {
    private Double velocidad;
    private int vida;

    public Nave(int x, int y, char direccion, Double velocidad, int vida) {
        super(x, y, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    @Override
    public void irA(int x, int y, char direccion){
        if (this.getDireccion() == direccion) {
            this.setPosX(x);
            this.setPosY(y);
        }
        else {
            girar(direccion);
            this.setPosX(x);
            this.setPosY(y);
        }
    }

    public void girar(char direccion){
        this.setDireccion(direccion);
    }

    public void restaVida(int valor){
        this.setVida(this.getVida()-valor);
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return super.toString() + "Nave{" +
                "velocidad=" + velocidad +
                ", vida=" + vida +
                '}';
    }
}

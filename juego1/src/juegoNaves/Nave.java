package juegoNaves;

public class Nave extends Objeto1 {
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad, int vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }
    public char girar(char direccion){
        setDireccion(direccion);
        return direccion;

    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        super.irA(x, y, direccion);
        if (getDireccion() != direccion) {

        }
        setPosx(x);
        setPosy(y);
    }
    public int restaVida(int valor){
    setVida(vida-valor);
    return this.vida;
    }


}

package ejercicios;

public class Objeto {
    private int posX;
    private int posY;
    private char direccion;

    public Objeto(int x, int y, char direccion){
        this.posX = x;
        this.posY = y;
        this.direccion = direccion;
    }

    public void irA(int x, int y, char direccion){
        this.setPosX(x);
        this.setPosY(y);
        this.setDireccion(direccion);
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", direccion=" + direccion +
                '}';
    }
}

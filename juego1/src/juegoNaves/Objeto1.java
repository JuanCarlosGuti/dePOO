package juegoNaves;

public class Objeto1 {
    private int posx;
    private int posy;
    private char direccion;

    public Objeto1(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }



    public void irA(int x, int y, char direccion){
        this.posx=x;
        this.posy=y;
        this.direccion=direccion;

    }



    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Objeto1{" +
                "posx=" + posx +
                ", posy=" + posy +
                ", direccion=" + direccion +
                '}';
    }
}

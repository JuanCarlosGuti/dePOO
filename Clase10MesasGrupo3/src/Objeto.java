public class Objeto {
    private Integer posx;
    private Integer posy;
    private char direccion;

    public Objeto (Integer x, Integer y, char direccion) {
        this.posx = x;
        this.posy = y;
        this.direccion = direccion;
    }

    public void irA (Integer x, Integer y, char direccion) {
        this.posx = x;
        this.posy = y;
        this.direccion = direccion;
    }

    public Integer getPosx() {
        return posx;
    }

    public void setPosx(Integer posx) {
        this.posx = posx;
    }

    public Integer getPosy() {
        return posy;
    }

    public void setPosy(Integer posy) {
        this.posy = posy;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }
}

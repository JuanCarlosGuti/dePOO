public class Asteroide extends Objeto {
    private int lesion;

    public Asteroide (Integer x, Integer y, char direccion, Integer lesion) {
        super(x, y, direccion);
        this.lesion = lesion;
    }

    public void irA (Integer x, Integer y, char direccion) {
        return;
    }

    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }
}

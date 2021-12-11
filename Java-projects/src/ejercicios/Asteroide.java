package ejercicios;

public class  Asteroide extends Objeto{
    private int lesion;

    public Asteroide(int x, int y, char direccion, int lesion) {
        super(x, y, direccion);
        this.lesion = lesion;
    }

    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }

    @Override
    public String toString() {
        return super.toString() + "Asteroide{" +
                "lesion=" + lesion +
                '}';
    }
}

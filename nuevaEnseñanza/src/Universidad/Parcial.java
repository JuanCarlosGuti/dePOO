package Universidad;

public class Parcial {
    public int compareTo(Object o) {
        Yates yate=(Yates) o;
        int respuesta =0;
        if(this.getCantidadCamarates()>yate.getCantidadCamarates())
            respuesta=1;
        if (this.getCantidadCamarates()>yate.getCantidadCamarates())
            respuesta=-1;

        return respuesta;
    }
}

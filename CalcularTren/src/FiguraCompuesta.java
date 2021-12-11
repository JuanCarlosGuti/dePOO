import java.util.ArrayList;
import java.util.List;

public class FiguraCompuesta implements Figura {
    private String nombre;
    private List<Figura> figuras;

    public FiguraCompuesta(String nombre) {
        this.nombre = nombre;
        figuras=new ArrayList();
    }

    @Override
    public double calcularArea() {
        double totalArea =0;
        for (Figura figura: figuras){
            totalArea+=figura.calcularArea();

        }
        return totalArea;
    }

    public void agregarFigura(Figura f){
        figuras.add(f);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

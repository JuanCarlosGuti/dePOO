package Instituto;

import java.util.ArrayList;
import java.util.List;

public class Programa extends OfertaAcademica {
    private List<OfertaAcademica> cursos;
    private double descuento;


    public Programa(String nombre, String descripcion) {
         super(nombre, descripcion);
         cursos = new ArrayList<>();
    }

    public void agragarCurso(OfertaAcademica curso){
        cursos.add(curso);
    }



    @Override
    public double precio() {
        double valor = 0;
        for (OfertaAcademica curso: cursos){
            valor+=curso.precio();
        }
        return valor*((100-this.descuento)/100);
    }



    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}

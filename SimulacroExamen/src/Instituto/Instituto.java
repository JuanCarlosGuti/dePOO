package Instituto;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<OfertaAcademica> ofertas;

    public Instituto() {
        ofertas= new ArrayList<>();
    }

    public void agregarOfertaAcademica(OfertaAcademica oferta){
        ofertas.add(oferta);

    }

    public void mostrarOfertaAcademica(){
        for (OfertaAcademica oferta: ofertas){
            System.out.println(
                            "------------------------\n"+
                            "Nombre: "+oferta.getNombre()+"\n" +
                            "Precio: "+oferta.precio()+"\n" +
                            "------------------------"
            );
        }

    }

}

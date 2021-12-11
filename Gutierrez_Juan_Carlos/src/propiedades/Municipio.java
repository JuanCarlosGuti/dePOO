package propiedades;

import java.util.ArrayList;
import java.util.List;

public class Municipio {

    private String nombre;
    private List<PropiedadesMunicipio> propiedades;

    public Municipio(String nombre) {
        this.nombre = nombre;
        propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(PropiedadesMunicipio propiedad){
        propiedades.add(propiedad);
    }

    public void mostrarPropiedades(){
        for (PropiedadesMunicipio prop: propiedades)
        System.out.println(
                  "Calle: "+  prop.getCalle()+"\n" +
                  "Numero: "+prop.getNumero()+"\n" +
                  "Impuesto: "+prop.calcularImpuesto());


    }
}

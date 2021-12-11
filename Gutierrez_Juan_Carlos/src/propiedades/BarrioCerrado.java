package propiedades;

import java.util.ArrayList;
import java.util.List;

public class BarrioCerrado extends PropiedadesMunicipio {
    private int factorMultiplicador;
    private List<PropiedadesMunicipio> propiedades;

    public BarrioCerrado() {
        propiedades = new ArrayList<>();

    }




    public BarrioCerrado(String calle, String numero, int factorMultiplicador) {
        super(calle, numero);
        this.factorMultiplicador = factorMultiplicador;
        propiedades = new ArrayList<>();
    }

    @Override
    public double calcularImpuesto() {
        double sumaImpuesto=0;
        for(PropiedadesMunicipio propiedad: propiedades){
           sumaImpuesto+= propiedad.calcularImpuesto();
        }

        return sumaImpuesto;
    }

    public int getFactorMultiplicador() {
        return factorMultiplicador;
    }

    public void setFactorMultiplicador(int factorMultiplicador) {
        this.factorMultiplicador = factorMultiplicador;
    }
    public void agregarPropiedad(PropiedadesMunicipio prop){
        propiedades.add(prop);
    }
}

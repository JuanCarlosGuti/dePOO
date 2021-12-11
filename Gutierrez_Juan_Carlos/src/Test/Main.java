package Test;

import propiedades.BarrioCerrado;
import propiedades.Casa;
import propiedades.FactoryPropiedades;
import propiedades.PropiedadesMunicipio;

public class Main {
    public static void main(String[] args) {
        PropiedadesMunicipio casa1= FactoryPropiedades.getInstance().crearPropiedad("casa");
        PropiedadesMunicipio casa2= FactoryPropiedades.getInstance().crearPropiedad("casa");
        PropiedadesMunicipio barrioCerrado= FactoryPropiedades.getInstance().crearPropiedad("barrio");

        ((Casa)casa1).setMontoImpuesto(500);
        casa1.setNumero("130");
        casa1.setCalle("Av. San Martin");
        System.out.println("La casa1 de impuesto: "+casa1.calcularImpuesto());

        ((Casa)casa2).setMontoImpuesto(700);
        casa1.setNumero("233");
        casa1.setCalle("Mitre");
        System.out.println("La casa2 de impuesto: "+  casa2.calcularImpuesto());

        ((BarrioCerrado)barrioCerrado).setFactorMultiplicador(2);
        casa1.setNumero("330");
        casa1.setCalle("Gutierres");
        System.out.println("La casa1 de impuesto: "+barrioCerrado.calcularImpuesto());

        ((BarrioCerrado)barrioCerrado).agregarPropiedad(casa1);
        ((BarrioCerrado)barrioCerrado).agregarPropiedad(casa2);
        System.out.println("La casa1 de impuesto: "+barrioCerrado.calcularImpuesto());














    }
}

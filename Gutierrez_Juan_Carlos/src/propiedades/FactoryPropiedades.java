package propiedades;

public class FactoryPropiedades {
    private static FactoryPropiedades instancia = null;

    private FactoryPropiedades(){

    }

    public static FactoryPropiedades getInstance(){
        if(instancia==null)
            instancia= new FactoryPropiedades();
        return instancia;

    }

    public PropiedadesMunicipio crearPropiedad(String propiedad){
        switch (propiedad){
            case "casa":
                return new Casa();
            case "barrio":
                return new BarrioCerrado();
            default:
                System.out.println(" no se encuentra esa propiedad");

        }
        return null;
    }
}

package Instituto;

public class FactoryCursos {

    private static FactoryCursos instancia= null;

    private FactoryCursos(){

    }

    public static FactoryCursos getInstance(){
        if(instancia == null)
            instancia = new FactoryCursos();
    return instancia;
    }

    public OfertaAcademica crearOfertaAcademica(String codigo, String nombre, String descripcion){
        switch (codigo){
            case"curso":
                return new Cursos(nombre, descripcion);
            case "programa":
                return new Programa(nombre,descripcion);
            default:
                System.out.println("no se encontro el codigo");
                return null;

        }
    }


}

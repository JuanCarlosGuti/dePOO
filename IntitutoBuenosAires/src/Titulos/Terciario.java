package Titulos;

public class Terciario extends Titulos {

    private boolean validacionNacional;
    private boolean validacionProvincial;

    public Terciario(int cantidadMaterias, String fechaInicio, String fechaFinal, boolean selladoMinisterio, boolean selladoInstituto, Personas personas, boolean validacionNacional, boolean validacionProvincial) {
        super(cantidadMaterias, fechaInicio, fechaFinal, selladoMinisterio, selladoInstituto, personas);
        this.validacionNacional = validacionNacional;
        this.validacionProvincial = validacionProvincial;
    }



    public boolean validoNacional() {
        return this.validacionNacional;
    }


}

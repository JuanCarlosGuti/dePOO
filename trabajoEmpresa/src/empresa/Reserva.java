package empresa;

public class Reserva {

    private String codigo;
    private int cantViajeros;
    private String estacionOrigen;
    private String estacionDestino;

    public Reserva(String codigo, int cantViajeros, String estacionOrigen, String estacionDestino) {
        this.codigo = codigo;
        this.cantViajeros = cantViajeros;
        this.estacionOrigen = estacionOrigen;
        this.estacionDestino = estacionDestino;
    }

    private boolean viajeCabeceras(){
        if ((this.estacionDestino.equals("Buenos Aires")&&this.estacionOrigen.equals("Bragado"))||
                (this.estacionDestino.equals("Bragado")&&this.estacionOrigen.equals("Buenos Aires"))){
            return true;
        }
        return false;
    }

    public double CalcularPrecio(){

        if(viajeCabeceras()){
        return     (50*this.cantViajeros)*.8;
        }
        return 50*this.cantViajeros;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantViajeros() {
        return cantViajeros;
    }

    public void setCantViajeros(int cantViajeros) {
        this.cantViajeros = cantViajeros;
    }

    public String getEstacionOrigen() {
        return estacionOrigen;
    }

    public void setEstacionOrigen(String estacionOrigen) {
        this.estacionOrigen = estacionOrigen;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }

    public void setEstacionDestino(String estacionDestino) {
        this.estacionDestino = estacionDestino;
    }
}

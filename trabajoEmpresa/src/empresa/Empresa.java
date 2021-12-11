package empresa;

import java.util.ArrayList;


public class Empresa {
private ArrayList<Reserva> reservas;

    public Empresa() {
        this.reservas= new ArrayList<>();
    }


    public double recaudacionTotal(){
        double totalRecaudado=0;
        for(Reserva reserva: reservas){
            totalRecaudado+=reserva.CalcularPrecio();
        }
        return totalRecaudado;


    }
    public void agregarReserva(Reserva reserva){
        reservas.add(reserva);

    }

    public int cantidadDeRecorridos(String nombreEstacion) throws Exception {
        int contador=0;
        if (nombreEstacion.equals("Buenos Aires")||nombreEstacion.equals("Luján")||
            nombreEstacion.equals( "Mercedes")||nombreEstacion.equals("Suipacha")||nombreEstacion.equals("Chivilcoy")||
        nombreEstacion.equals("Alberti")||nombreEstacion.equals("Bragado")){
            for (Reserva reserva: reservas){
                if (reserva.getEstacionOrigen().equals(nombreEstacion)||reserva.getEstacionDestino().equals(nombreEstacion)){
                    contador+=1;
                }
            }
        }else {
            throw new Exception("la estacion: "+nombreEstacion+" no estaba en el recorrido");
        }

        return contador;

    }
}

package Equipo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void addJugadores(Jugador jugador){
        this.jugadores.add(jugador);
    }

    public void mostrarJugador(){
        jugadores.sort(null);
        for( Jugador jugador: jugadores){
           if (jugador.isTitular()){
               System.out.println(jugador.getNombre());
           }

        }

    }

    public int getCantidadJugadoresLesionados(){
        int cantidaJugadoresLesionados=0;
        for (Jugador jugador: jugadores){
            if (jugador.isLesionado()&&jugador.isTitular()){
                cantidaJugadoresLesionados+=1;
            }
        }
        return cantidaJugadoresLesionados;
    }

    public void ordenarJugadores(){
    jugadores.sort(null);
    mostrarJugador();
    }


}

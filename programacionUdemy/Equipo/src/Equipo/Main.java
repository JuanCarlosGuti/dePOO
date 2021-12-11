package Equipo;

public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador(7,"pedro",true,true);
        Jugador jugador1= new Jugador(9,"pablo",false,true);
        Jugador jugador2= new Jugador(12,"Luca",false,false);
        Jugador jugador3= new Jugador(3,"Maria",false,true);
        Jugador jugador4= new Jugador(11,"camila",true,true);
        Jugador jugador5= new Jugador(8,"manuel", false,false);
        Equipo equipo = new Equipo("marinilla");
        equipo.addJugadores(jugador);
        equipo.addJugadores(jugador1);
        equipo.addJugadores(jugador2);
        equipo.addJugadores(jugador3);
        equipo.addJugadores(jugador4);
        equipo.addJugadores(jugador5);

        equipo.mostrarJugador();
        System.out.println(equipo.getCantidadJugadoresLesionados());



    }
}

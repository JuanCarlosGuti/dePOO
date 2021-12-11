package empresa;

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Reserva reserva1= new Reserva("c5",5,"Buenos Aires","Chivilcoy");

        empresa.agregarReserva(new Reserva("a1",2,"Buenos Aires","Luján"));
        empresa.agregarReserva(new Reserva("a2",1,"Mercedes","Suipacha"));
        empresa.agregarReserva(new Reserva("a3",4,"Buenos Aires","Chivilcoy"));
        empresa.agregarReserva(new Reserva("a4",6,"Buenos Aires","Luján"));
        empresa.agregarReserva(new Reserva("a5",2,"Mercedes","Suipacha"));
        empresa.agregarReserva(new Reserva("a6",1,"Alberti","Buenos Aires"));
        empresa.agregarReserva(new Reserva("a7",2,"Buenos Aires","Bragado"));
        empresa.agregarReserva(new Reserva("a8",1,"Bragado","Buenos Aires"));
        empresa.agregarReserva(new Reserva("a9",3,"Luján","Chivilcoy"));

        empresa.agregarReserva(reserva1);

        System.out.println("La recaudación total de la empresa fue de "+empresa.recaudacionTotal());
        try {
            System.out.println("Los recorridos a Luján fueron "+empresa.cantidadDeRecorridos("Luján"));
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        System.out.println("El precio de la reserva 1 es de $"+reserva1.CalcularPrecio());
    }
}

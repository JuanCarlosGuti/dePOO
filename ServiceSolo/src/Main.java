import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Reparacion r = new Reparacion("molino");
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección");


        try {
            r.cambiarDireccion(direccion);

        } catch (ExcepcionesDeReparacion e) {
            JOptionPane.showMessageDialog(null,e.getMessage());

            System.exit(0);

        }

    }
}

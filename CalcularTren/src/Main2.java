import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("ingrese un numero entero");
        int numeroDecimal = Integer.parseInt(numeroStr);
        System.out.println("numero decimal "+ numeroDecimal);
        System.out.println("numero binarfio de "+ numeroDecimal+" = "+Integer.toBinaryString(numeroDecimal));
        System.out.println("numero Octal de "+ numeroDecimal+" = "+Integer.toOctalString(numeroDecimal));
        System.out.println("numero hexadecimal de "+ numeroDecimal+" = "+Integer.toHexString(numeroDecimal));

        String mensaje = "numero binario de "+numeroDecimal+" = "+Integer.toBinaryString(numeroDecimal);
        mensaje += "\nnumero octal de "+ numeroDecimal+" = "+Integer.toOctalString(numeroDecimal);
        mensaje+= "\nnumero hexadecimal de "+numeroDecimal+" = "+Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null,mensaje);
    }
}

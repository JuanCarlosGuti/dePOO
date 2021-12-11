package manjoArchivo;

import java.io.*;

public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida= new PrintWriter(archivo);
            salida.close();
            System.out.println("El archivo ha sido creado");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }
    public static void escribirArchivo(String nombreArchivo,String mensaje){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida= new PrintWriter(archivo);
            salida.println(mensaje);
            salida.close();
            System.out.println("El archivo ha sido escrito");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }
    public static void anexarInformacion(String nombreArchivo, String nuevoMensaje){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida= new PrintWriter(new FileWriter(archivo,true));
            salida.println(nuevoMensaje);
            salida.close();
            System.out.println("El archivo ha adicionado");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }


    }
    public static void leerArchivo(String nombreArchivo){
        var archivo = new File(nombreArchivo);
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura!=null){
                System.out.println("lectura: "+lectura);
                lectura=entrada.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

    }
}

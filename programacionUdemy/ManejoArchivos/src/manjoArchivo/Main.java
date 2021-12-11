package manjoArchivo;

import static manjoArchivo.ManejoArchivos.*;

public class Main {

    public static void main(String[] args) {
        var archivo= "prueba Archivo.txt";
        crearArchivo(archivo);
        escribirArchivo(archivo,"es te es otro mensaje");
        anexarInformacion(archivo," Este es el mensaje adicional");
        anexarInformacion(archivo,"esta información va al final");
        leerArchivo(archivo);
    }
}

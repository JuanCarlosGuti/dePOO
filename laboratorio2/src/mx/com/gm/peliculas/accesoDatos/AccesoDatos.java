package mx.com.gm.peliculas.accesoDatos;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

import java.util.List;

public interface AccesoDatos {

    boolean existe(String nombreArchivo) throws AccesoDatosExcepciones;

    List<Pelicula> listar(String nombre) throws LecturaDatos;

    void escribir(Pelicula pelicula, String nombreArchivo,boolean anexar) throws EscrituraDatos;
    String buscar(String nombreArchivo, String buscar) throws LecturaDatos;
    void crear(String nombreArchivo) throws AccesoDatosExcepciones;
    void borrar (String nombreArchivo) throws AccesoDatosExcepciones;


}

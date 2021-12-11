package mx.com.gm.peliculas.accesoDatos;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosExcepciones;
import mx.com.gm.peliculas.excepciones.EscrituraDatos;
import mx.com.gm.peliculas.excepciones.LecturaDatos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ImplementacionAccesoDatos implements AccesoDatos{
    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosExcepciones {
        File archivo= new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombre) throws LecturaDatos {
        File archivo=new File(nombre);
        List<Pelicula> peliculas=new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea!=null){
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea=entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatos("Excepcion al listar Peliculas: "+ e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatos("Excepcion al listar Peliculas: "+ e.getMessage());
        }
        return peliculas;

    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatos {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida=new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("se ha escrito información en el archivo"+pelicula);
        } catch (IOException e) {
            e.printStackTrace();
            throw new EscrituraDatos("Excepcion al escribir peliculas: "+e.getMessage());

        }

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatos {
        File archivo = new File(nombreArchivo);
        String resultado= null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea= entrada.readLine();
            int indice =1;
            while (linea!=null){
                if(buscar!=null&&buscar.equalsIgnoreCase(linea)){
                    resultado = "Pelicula "+linea+" encontrada en el indice "+indice;
                }
                linea=entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatos("Excepcion al listar Peliculas: "+ e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatos("Excepcion al listar Peliculas: "+ e.getMessage());
        }
        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosExcepciones {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException e) {
            e.printStackTrace();
            throw new AccesoDatosExcepciones("Excepcion al crear archivo: "+ e.getMessage());
        }

    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosExcepciones {
        var archivo = new File(nombreArchivo);
        if (archivo.exists())
            archivo.delete();
        System.out.println(" se ha eleminado el archivo");

    }
}


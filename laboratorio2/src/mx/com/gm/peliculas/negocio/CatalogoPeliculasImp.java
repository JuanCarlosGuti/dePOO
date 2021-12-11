package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.accesoDatos.AccesoDatos;
import mx.com.gm.peliculas.accesoDatos.ImplementacionAccesoDatos;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosExcepciones;
import mx.com.gm.peliculas.excepciones.LecturaDatos;

public class CatalogoPeliculasImp implements CatalogoPeliculas{
    private final AccesoDatos datos;

    public CatalogoPeliculasImp() {
        this.datos= new ImplementacionAccesoDatos();


    }


    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula= new Pelicula(nombrePelicula);
        boolean anexar=false;
        try {
            anexar = datos.existe(NOMBRE_PELICULA);
            datos.escribir(pelicula,NOMBRE_PELICULA,anexar);
        } catch (AccesoDatosExcepciones e) {
            System.out.println("Error de acceso a datos");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas= this.datos.listar(NOMBRE_PELICULA);
            for (Pelicula pelicula: peliculas){
                System.out.println("la pelicula"+pelicula);
            }
        } catch (AccesoDatosExcepciones e) {
            System.out.println("Se registro un error al leer datos");
            e.printStackTrace(System.out);
        }

    }

    @Override
    public void buscarPelicula(String abuscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_PELICULA,abuscar);
        } catch (LecturaDatos e) {
            System.out.println("error acceso datos");
            e.printStackTrace(System.out);
        }
        System.out.println("Resultado "+resultado);

    }

    @Override
    public void iniciarCtalogoPelicula() {
        try {
            if (this.datos.existe(NOMBRE_PELICULA)){
                datos.borrar(NOMBRE_PELICULA);
                datos.crear(NOMBRE_PELICULA);
            }
            else {
                datos.crear(NOMBRE_PELICULA);
            }
        } catch (AccesoDatosExcepciones e) {
            System.out.println("Error al inciar catalogo de peliculas");
            e.printStackTrace(System.out);
        }

    }
}

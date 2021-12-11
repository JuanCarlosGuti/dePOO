package mx.com.gm.peliculas.negocio;



public interface CatalogoPeliculas {
    String NOMBRE_PELICULA="peliculas.txt";

    void agregarPelicula(String nombrePelicula);

    void listarPeliculas();
    void buscarPelicula(String abuscar);
    void iniciarCtalogoPelicula();






}

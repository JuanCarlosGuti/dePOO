package mx.com.gm.peliculas.Presentacion;

import mx.com.gm.peliculas.negocio.CatalogoPeliculas;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImp;

import java.util.Scanner;

public class CatalogoPeliculasPresentacion {

    public static void main(String[] args) {
        var opcion=-1;
        Scanner entrada = new Scanner(System.in);
        CatalogoPeliculas catalogo = new CatalogoPeliculasImp();

        while(opcion!=0){
            System.out.println("Elige una opción: \n" +
                    "1.iniciar catalogo de peliculas \n" +
                    "2.Agregar pelicula \n" +
                    "3.Lista Peliculas \n" +
                    "4.Buscar Pelicula \n" +
                    "0.Salir");
            opcion=Integer.parseInt(entrada.nextLine());
            switch (opcion){
                case 1:
                    catalogo.iniciarCtalogoPelicula();
                    break;
                case 2:
                    System.out.println("Introduce el nombre  de la pelicula");
                    String nombrePelicula = entrada.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("introduce el nombre de una pelicula a buscar");
                    String buscar = entrada.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("hasta pronto");
                    break;
                default:
                    System.out.println("opcion no reconocida");
                    break;

            }
        }
    }
}

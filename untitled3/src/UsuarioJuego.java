public class UsuarioJuego {


    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    public void aumentarPuntaje() {
       puntaje+=1;

    }

    public void subirNivel() {
        nivel+=1;
    }





    public UsuarioJuego(String nombre, String clave){
        this.nombre =nombre;
        this.clave = clave;



    }
}

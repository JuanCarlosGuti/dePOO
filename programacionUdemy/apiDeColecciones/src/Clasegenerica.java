public class Clasegenerica <T>{
    T objeto;

    public Clasegenerica(T objeto){
        this.objeto = objeto;
    }

    public void obtenerTipo(){
        System.out.println("el tipo T es "+objeto.getClass().getSimpleName());
    }
}

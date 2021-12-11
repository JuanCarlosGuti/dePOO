package caja;

public class Caja {

    int ancho;
    int alto;
    int profundo;

    public Caja(){
        System.out.println("vacio");

    }
    public Caja(int arg1, int arg2, int arg3){
        this.alto=arg1;
        this.ancho=arg2;
        this.profundo=arg3;

    }
    public int CalculoVolumen(){
        int volumen= alto*ancho*profundo;
        return volumen;
    }


}

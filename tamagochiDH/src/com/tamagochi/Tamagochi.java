package com.tamagochi;

public class Tamagochi {
    private StateTamagochi estado;

    public Tamagochi(){
        estado=new Hambre(this);
    }


    public StateTamagochi getEstado(){
        return estado;
    }
    public void setEstado(StateTamagochi estado){
        this.estado=estado;
    }

    //acciones

    public void comer(){
        this.estado.comer();
    }

    public void beber() {
       this.estado.beber();


    }


    public void mimos() {
       this.estado.mimos();

    }
}

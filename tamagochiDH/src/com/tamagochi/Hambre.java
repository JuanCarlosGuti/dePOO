package com.tamagochi;

public class Hambre implements StateTamagochi{
    private Tamagochi t;
    public Hambre(Tamagochi t){
        this.t = t;
    }

    @Override
    public void comer() {
        System.out.println("se le dio de Comer");
        this.t.setEstado(new Feliz(t));

    }

    @Override
    public void beber() {
        System.out.println("no pasa nada");


    }

    @Override
    public void mimos() {

    }
}

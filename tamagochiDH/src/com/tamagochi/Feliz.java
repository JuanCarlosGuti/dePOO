package com.tamagochi;

public class Feliz implements StateTamagochi{
    private Tamagochi t;

    public Feliz(Tamagochi t){
        this.t = t;
        System.out.println("Feliz");

    }

    @Override
    public void comer() {
        //no hay cambios

    }

    @Override
    public void beber() {

        //no hay cambios

    }

    @Override
    public void mimos() {
        //no hay cambios

    }
}

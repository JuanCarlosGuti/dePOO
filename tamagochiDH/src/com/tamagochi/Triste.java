package com.tamagochi;

public class Triste implements StateTamagochi{
    private Tamagochi t;

    public Triste(Tamagochi t){

        this.t = t;
        System.out.println("Triste");

    }

    @Override
    public void comer() {

    }

    @Override
    public void beber() {

    }

    @Override
    public void mimos() {
        System.out.println("Haciendo mimos");
        t.setEstado(new Feliz(t));


    }
}

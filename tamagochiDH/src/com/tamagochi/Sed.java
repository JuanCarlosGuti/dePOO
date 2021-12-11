package com.tamagochi;

public class Sed implements StateTamagochi{
    private Tamagochi t;
    public Sed(Tamagochi t){
        this.t = t;
        System.out.println("Sediento");

    }

    @Override
    public void comer() {
    //no hay cambios
    }

    @Override
    public void beber() {
        System.out.println("pasa de sediento a feliz");
        t.setEstado(new Feliz(t));


    }

    @Override
    public void mimos() {
        //no hay cambios

    }
}

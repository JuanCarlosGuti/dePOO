package com.tamagochi;

public class Main {
    public static void main(String[] args) {
        Tamagochi ferbi = new Tamagochi();
        ferbi.mimos();
        ferbi.beber();
        ferbi.comer();
        ferbi.setEstado(new Sed(ferbi));
        ferbi.comer();
        ferbi.beber();
    }
}

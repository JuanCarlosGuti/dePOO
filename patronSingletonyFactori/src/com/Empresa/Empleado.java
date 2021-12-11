package com.Empresa;

public abstract class Empleado {
    private String nombre;
    private String apllido;
    private int legajo;

    public Empleado() {
    }

    public Empleado(String nombre, String apllido, int legajo) {
        this.nombre = nombre;
        this.apllido = apllido;
        this.legajo = legajo;
    }

    public abstract double calcularSueldo();

}

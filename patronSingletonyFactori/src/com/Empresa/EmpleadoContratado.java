package com.Empresa;

public class EmpleadoContratado extends Empleado{
    private double importePorHora;
    private double Impuesto;

    public EmpleadoContratado() {
    }

    public EmpleadoContratado(String nombre, String apllido, int legajo, double importePorHora, double impuesto) {
        super(nombre, apllido, legajo);
        this.importePorHora = importePorHora;
        Impuesto = impuesto;
    }


    @Override
    public double calcularSueldo() {
        return 0;
    }

    @Override
    public String toString() {
        return "EmpleadoContratado{" +
                "importePorHora=" + importePorHora +
                ", Impuesto=" + Impuesto +
                '}';
    }
}

package com.Empresa;

public class EmpleadoContratado extends Empleado{
    private Double importePorHoras;
    private Integer horasTrabajadas;
    //private Double retencionImpuesto;


    public EmpleadoContratado(String nombre, String apellido, int legajo, Double importePorHoras, Integer horasTrabajadas) {
        super(nombre, apellido, legajo);
        this.importePorHoras = importePorHoras;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }
}

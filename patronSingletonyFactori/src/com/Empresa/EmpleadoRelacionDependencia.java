package com.Empresa;

public class EmpleadoRelacionDependencia  extends Empleado{
    private Double SueldoMensual;

    public EmpleadoRelacionDependencia() {}

    public EmpleadoRelacionDependencia(String nombre, String apllido, int legajo, double sueldoMensual) {
        super(nombre, apllido, legajo);
        this.SueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }
}

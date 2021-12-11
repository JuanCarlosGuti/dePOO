package com.Empresa;

public class EmpleadoRelacionDependencia extends Empleado{

    private Double sueldomensual;

    public EmpleadoRelacionDependencia(String nombre, String apellido, int legajo, Double sueldomensual) {
        super(nombre, apellido, legajo);
        this.sueldomensual = sueldomensual;
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }
}

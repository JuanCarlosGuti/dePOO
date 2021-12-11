package com.Empresa;

import java.util.List;
import java.util.ArrayList;



public class Empresa {
    private String razonSocial;
    private List<Empleado> empleados;

    public Empresa(String razonSocial, List<Empleado> empleados) {
        this.razonSocial = razonSocial;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public void calcularSueldosTotales(){
        return;
    }
}

package com.Empresa;

import java.util.ArrayList;

public class Empresa {
    public String razonSocial;
    private ArrayList<Empleado> empleados;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        this.empleados = new ArrayList<>();
    }

    public void crearEmpleado(Empleado empleado){
        empleados.add(empleado);
        System.out.println(" empleado creado");

    }

    @Override
    public String toString() {
        return "Empresa{" +
                "razonSocial='" + razonSocial + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}

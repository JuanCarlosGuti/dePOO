package com.Empresa;

public class Main {
    public static void main(String[] args) {
    EmpleadoFactory empleadoFactory= EmpleadoFactory.getInstancia();
    Empresa empresa= new Empresa("empresita");

    empresa.crearEmpleado(empleadoFactory.crearEmpleado("EMP-EXT"));

        System.out.println(empresa);

    }
}

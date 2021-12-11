package com.Empresa;

public class EmpleadoFactory {

    private static EmpleadoFactory instance;

    private EmpleadoFactory() {
    }

    public static EmpleadoFactory getInstance(){
        if (instance==null){
            instance=new EmpleadoFactory();

        }
        return instance;

    }

    public Empleado crearEmpleado(String codigo){

    }
}

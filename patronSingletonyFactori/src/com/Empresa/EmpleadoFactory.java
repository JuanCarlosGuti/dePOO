package com.Empresa;

public class EmpleadoFactory {

    private static EmpleadoFactory instancia;

    private EmpleadoFactory() {

    }
    public static EmpleadoFactory getInstancia(){
    if (instancia==null){
        instancia= new EmpleadoFactory();
    }
        return instancia;
    }

    public Empleado crearEmpleado(String codigo){
            if (codigo=="EMP-EXT"){
                return new EmpleadoRelacionDependencia();
            } else if(codigo=="EMP-INT"){
                return new EmpleadoContratado();
            }
            return null;
    }
}

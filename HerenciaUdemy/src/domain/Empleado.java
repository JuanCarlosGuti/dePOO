package domain;

public class Empleado extends Persona{
private int idEmpleado;
private double sueldo;
private static int contadorEmpleado;

    public Empleado(){
        super();
        this.idEmpleado=Empleado.contadorEmpleado;
    }


    public Empleado(int idEmpleado, double sueldo) {
        this();
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, int idEmpleado, double sueldo) {
        super(nombre);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, char genero, int edad, String direccion, int idEmpleado, double sueldo) {
        super(nombre, genero, edad, direccion);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, char genero, int edad, int idEmpleado, double sueldo) {
        super(nombre, genero, edad);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, char genero, int idEmpleado, double sueldo) {
        super(nombre, genero);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado=++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
         return idEmpleado;
    }



    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", Nombre=").append(this.nombre);
        sb.append(", sueldo=").append(this.sueldo);

        sb.append('}');
        return sb.toString();
    }
}

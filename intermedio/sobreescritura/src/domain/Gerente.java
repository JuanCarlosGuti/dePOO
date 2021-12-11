package domain;

import java.util.Objects;

public class Gerente extends Empleado {
   private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento=departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gerente)) return false;
        Gerente gerente = (Gerente) o;
        return Objects.equals(departamento, gerente.departamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departamento);
    }

    @Override
    public String ObtenerDetalles() {
        return super.ObtenerDetalles()+" departamento: "+this.departamento;
    }
}

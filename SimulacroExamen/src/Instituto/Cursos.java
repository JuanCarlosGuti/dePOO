package Instituto;

public class Cursos extends OfertaAcademica{
    private double cantidadHoras;
    private double cantidadMeses;
    private double valorHora;

    public Cursos(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public Cursos(String nombre, String descripcion, double cantidadHoras, double cantidadMeses, double valorHora) {
        super(nombre, descripcion);
        this.cantidadHoras = cantidadHoras;
        this.cantidadMeses = cantidadMeses;
        this.valorHora = valorHora;
    }

    @Override
    public double precio() {
        return cantidadHoras*cantidadMeses*valorHora;
    }

    public double getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(double cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public double getCantidadMeses() {
        return cantidadMeses;
    }

    public void setCantidadMeses(double cantidadMeses) {
        this.cantidadMeses = cantidadMeses;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}

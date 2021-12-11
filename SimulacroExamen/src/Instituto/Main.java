package Instituto;

public class Main {
    public static void main(String[] args) {

        Instituto instituto1 = new Instituto();
        OfertaAcademica programa1= FactoryCursos.getInstance().crearOfertaAcademica(
                "programa","fullStack","todo lo que se necesita");
       OfertaAcademica curso1 = FactoryCursos.getInstance().crearOfertaAcademica(
               "curso","backend", "lo que se necesita");
       OfertaAcademica curso2 = FactoryCursos.getInstance().crearOfertaAcademica(
               "curso","frontend","otra cosa");
        OfertaAcademica curso3 = FactoryCursos.getInstance().crearOfertaAcademica(
                "curso","Git","todo Git");

        ((Cursos)curso1).setCantidadHoras(16);
        ((Cursos)curso1).setCantidadMeses(2);
        ((Cursos)curso1).setValorHora(1000);


        ((Cursos)curso2).setCantidadHoras(20);
        ((Cursos)curso2).setCantidadMeses(2);
        ((Cursos)curso2).setValorHora(900);


        ((Cursos)curso3).setCantidadHoras(16);
        ((Cursos)curso3).setCantidadMeses(2);
        ((Cursos)curso3).setValorHora(1000);

        ((Programa)programa1).agragarCurso(curso1);
        ((Programa)programa1).agragarCurso(curso2);
        ((Programa)programa1).setDescuento(20);


        System.out.println(programa1.precio());

        instituto1.agregarOfertaAcademica(programa1);
        instituto1.agregarOfertaAcademica(curso3);
        instituto1.mostrarOfertaAcademica();

    }
}

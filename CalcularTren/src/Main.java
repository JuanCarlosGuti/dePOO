public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5,4);


        FiguraCompuesta vagon= new FiguraCompuesta("vagon");
        vagon.agregarFigura(rectangulo);
        vagon.agregarFigura(new Circulo(1));
        vagon.agregarFigura(new Circulo(1));
        vagon.agregarFigura(new Circulo(1));

        System.out.println(vagon.calcularArea());

        FiguraCompuesta locomotora = new FiguraCompuesta("locomotora");
        locomotora.agregarFigura(new Rectangulo(6,4));

        locomotora.agregarFigura(new Circulo(1));
        locomotora.agregarFigura(new Circulo(1));

        locomotora.agregarFigura(new Triangulo(2,2));
        System.out.println(locomotora.calcularArea());





    }
}

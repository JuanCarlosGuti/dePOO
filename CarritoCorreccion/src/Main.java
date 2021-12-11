public class Main {
    public static void main(String[] args) {
        Producto jb= new Producto("jabon",2500);
        Producto crema1 = new Producto("dentrifico",3500);
        Carrito car1= new Carrito();
        car1.agregarProducto(jb);
        car1.cancelar();
        car1.volverPuntoanterior();
        car1.avanzar();
        System.out.println(car1);
        car1.agregarProducto(jb);
        car1.agregarProducto(crema1);
        System.out.println(car1);
    }
}

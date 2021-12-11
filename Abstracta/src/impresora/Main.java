package impresora;

public class Main {
    public static void main(String[] args) {
        String nombre;
        nombre = "Robinson";


        ImpresoraEpson imp1;
        imp1 = new ImpresoraEpson("ax1","USB",
                "06/2009",50,20);

        ImpresoraCanon imp2 = new ImpresoraCanon("dd1","Wifi",
                "10/2020",100,50);

        Impresora impresora;

        impresora = new ImpresoraEpson();
        System.out.println(impresora.imprimir());

        impresora = new ImpresoraCanon();
        System.out.println(impresora.imprimir());

    }
}

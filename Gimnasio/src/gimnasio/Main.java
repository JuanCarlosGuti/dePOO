package gimnasio;

public class Main {
    public static void main(String[] args) {

        SocioHabilitado socio1 = new SocioHabilitado("123a", "Paula",
                "Spinning", 10000., 2000.);

        System.out.println(socio1);
        socio1.setHabilitado(true);
        System.out.println(socio1.isHabilitado());
    }
}

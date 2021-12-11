package Titulos;

public class Test {
    public static void main(String[] args) {
        Personas personas1=new Personas("juan", "gutierrez",45657,25);
        Titulos titulo=new Licenciatura(4,"22-04-21","22-04-2020",true,true,personas1,"control","25-01-22",2);
        Titulos titulo2=new Licenciatura(5,"22","23",true,false,personas1,"tesis","56",10);
        ((Licenciatura)titulo2).compareTo(titulo);
        System.out.println(titulo);
    }
}

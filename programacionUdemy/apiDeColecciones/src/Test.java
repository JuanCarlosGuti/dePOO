import java.util.*;

public class Test {
    public static void main(String[] args) {
        List miLista= new ArrayList();


        miLista.add("lunes");
        miLista.add("martes");
        miLista.add("miercoles");
        miLista.add("jueves");
        miLista.add("viernes");


        Set miSet= new HashSet();
        miSet.add("manzana");
        miSet.add("piña");
        miSet.add("pera");
        miSet.add("mandarina");
        miSet.add("fresa");
        miSet.add("mango");
        miSet.add("mango");

        Map miMapa=new HashMap();
        miMapa.put("valor"," juan");
        miMapa.put("valor2", "carlos ");
        miMapa.put("Valor3", "esteban");

        //imprimir(miMapa.keySet());
        imprimir(miMapa.values());

    }

    public static void imprimir(Collection coleccion){
        coleccion.forEach(elemento->{
            System.out.println("elemento: "+elemento);
        });


    }
}

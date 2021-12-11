import java.util.*;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista= new ArrayList<>();


        miLista.add("lunes");
        miLista.add("martes");
        miLista.add("miercoles");
        miLista.add("jueves");
        miLista.add("viernes");

        String elemento = miLista.get(1);
        System.out.println(elemento);

        Set<String> miSet= new HashSet();
        miSet.add("manzana");
        miSet.add("piña");
        miSet.add("pera");
        miSet.add("mandarina");
        miSet.add("fresa");
        miSet.add("mango");
        miSet.add("mango");

        Map<String, String> miMapa=new HashMap();
        miMapa.put("valor"," juan");
        miMapa.put("valor2", "carlos ");
        miMapa.put("Valor3", "esteban");


        //imprimir(miLista);
        //imprimir(miSet);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());

    }

    public static void imprimir(Collection<String> coleccion){
        coleccion.forEach(elemento->{
            System.out.println("elemento: "+elemento);
        });


    }
}

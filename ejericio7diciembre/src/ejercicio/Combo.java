package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Item {
private List<Item> items;

    public Combo(String nombre) {
        super(nombre);
        items = new ArrayList();
    }

    public void agragarItem(Item i){
        items.add(i);
    }

    @Override
    double calcularPrecio() {
        double total = 0;
        for (Item i: items){
            total+=i.calcularPrecio();
        }
        return total*0.9;
    }

    @Override
    String mostrarDatos() {
        String texto=getNombre()+"Calcular Precio---->"+calcularPrecio()+"\n";
        for (Item i:items){
            texto= texto.concat(i.mostrarDatos()+"\n");
        }
        return texto;
    }
}

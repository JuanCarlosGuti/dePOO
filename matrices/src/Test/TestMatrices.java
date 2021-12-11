package Test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        int edades[][]=new int[3][2];
        System.out.println("Edades: "+ edades);
        edades[0][0]=5;
        edades[0][1]=17;
        edades[1][0]=6;
        edades[1][1]=4;
        edades[2][0]=22;
        edades[2][1]=13;


        String frutas[][]={{"naranaja","limon"},{"fresa", "zapote"}, {"lulo","mora"}};

        Persona personas[][] = new Persona[2][3];
        personas[0][0]=new Persona("juam");
        personas[0][1]=new Persona("carlos");
        personas[1][0]=new Persona("david");
        personas[1][1]=new Persona("luis");
        personas[0][2]=new Persona("jose");
        imprimir(personas);

        

    }

    public static void imprimir(Object matriz[][]){

        for (int fil=0;fil<matriz.length;fil++){
            for (int col=0;col<matriz[fil].length;col++){
                System.out.println("la edad: "+fil+" "+col+" :"+matriz[fil][col]);
            }
        }
    }
}

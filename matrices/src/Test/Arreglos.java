package Test;

public class Arreglos {

    public static void main(String[] args) {
        int edades[] = new int[3];
        edades[0]=10;
        edades[1]=56;
        edades[2]=21;
        System.out.println(edades);
        System.out.println(edades[0]);
        for (int j=0;j<edades.length;j++){
            System.out.println(j+" :"+edades[j]);
        }

    }
}

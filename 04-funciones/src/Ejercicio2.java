import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        int ini, fin;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de inicio");
        ini = sc.nextInt();

        System.out.println("Introduce el número de fin");
        fin = sc.nextInt();



        between(ini, fin);


    }

    static void between(int ini, int fin) {

        for(int i = ini + 1; i < fin; i++){

            System.out.println(i);

        }

    }


}

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas veces quieres imprimir la palabra eco");
        n = sc.nextInt();

        eco(n);


    }

    static void eco(int n) {

        for(int i = 0; i < n; i++) {
            System.out.println((i + 1) + " : ECO");
        }

    }


}
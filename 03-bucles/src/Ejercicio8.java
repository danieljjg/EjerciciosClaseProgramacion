import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de * que quieres pintar para tu triangulo rectangulo");
        n = sc.nextInt();

        for(int i = n; i > 0; i--) {

            for(int j = i; j > 0; j--) {

                System.out.print("*");

            }

            System.out.println("");

        }

    }

}

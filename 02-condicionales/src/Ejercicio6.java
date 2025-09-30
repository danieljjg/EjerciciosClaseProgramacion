import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de a: ");
        a = sc.nextInt();

        System.out.println("Introduce el valor de b: ");
        b = sc.nextInt();

        if(a > b) {
            System.out.println(a + " es mayor que " + b);
        } else {
            System.out.println(b + " es mayor que " + a);
        }

    }

}

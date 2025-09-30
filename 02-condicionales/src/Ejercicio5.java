import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        double a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de a");
        a = sc.nextDouble();

        if( (a > -1 && a < 1) && a != 0) {
            System.out.println("El numero es casi cero");
        }

        if(a != 0) {
            if(a > -1 && a < 1) {
                System.out.println("Es casi cero");
            } else {
                System.out.println("No es casi cero");
            }
        }

    }

}

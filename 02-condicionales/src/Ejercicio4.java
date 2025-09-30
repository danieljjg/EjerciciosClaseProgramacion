import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        a = sc.nextInt();

        System.out.println("Introduce el segundo numero");
        b = sc.nextInt();

        if(a == b) {
            System.out.println("Los numeros son iguales");
        } else if(a > b) {
            System.out.println("El numero a con valor : " + a + " es mayor que el numero con b con valor : " + b);
        } else {
            System.out.println("El numero b con valor : " + b + " es mayor que el numero con a con valor : " + a);
        }

    }

}

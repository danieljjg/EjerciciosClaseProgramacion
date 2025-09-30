import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {


        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de a: ");
        a = sc.nextInt();

        System.out.println("Ingrese el valor de b: ");
        b = sc.nextInt();

        System.out.println("Ingrese el valor de c: ");
        c = sc.nextInt();

        if(a > b && b > c) {
            System.out.println("El orden es correcto es : " + a + " " + b + " " + c);
        } else if(a > c && c > b) {
            System.out.println("El orden es correcto es : " + a + " " + c + " " + b);
        } else if(b > a && a > c) {
            System.out.println("El orden es correcto es : " + b + " " + a + " " + c);
        } else if( b > c && c > a) {
            System.out.println("El orden es correcto es : " + b + " " + c + " " + a);
        } else if( c > a && a > b) {
            System.out.println("El orden es correcto es : " + c + " " + a + " " + b);
        } else if(c > b && b > a) {
            System.out.println("El orden es correcto es : " + c + " " + b + " " + a);
        }


    }

}

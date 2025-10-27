import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Vamos a comprobar el valor mayor de dos números y luego de 3");

        System.out.println("Introduce el primer número");
        n1 = sc.nextInt();

        System.out.println("Introduce el segundo número");
        n2 = sc.nextInt();

        System.out.println("El mayor de los dos números es : " + mayor(n1, n2));

        System.out.println("Introduce un tercer número");
        n3 = sc.nextInt();

        System.out.println("El mayor de los tres números es : " + mayor(n1,n2, n3));

    }

    static int mayor(int n1, int n2) {

        if(n1 > n2) {
            return n1;
        } else if(n1 < n2) {
            return n2;
        } else {
            return 0;
        }

    }

    static int mayor(int n1, int n2, int n3) {

        if(n1 > n2 && n1 > n3) {
            return n1;
        } else if(n2 > n1 && n2 > n3) {
            return n2;
        } else if(n3 > n1 && n3 > n2) {
            return n3;
        } else {
            return 0;
        }

    }

}

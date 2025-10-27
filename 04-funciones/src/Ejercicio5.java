import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.println("Introduce un número, te vamos a decir si es primo ");
        n = sc.nextInt();

        boolean resultado = esPrimo(n);

        if(resultado){
            System.out.println("El numero es primo");
        } else  {
            System.out.println("El numero no es primo");
        }

    }

    public static boolean esPrimo(int num) {
        boolean primo = true;
        int i = 2;

        if(num < 2) {
            primo = false;
        }

        while( i < num && primo == true) {
            if(num % i == 0) {
                primo = false;
            }
            i++;
        }

        return primo;

    }

}

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        int numero;
        int guarismo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número de 3 cifras");
        numero = sc.nextInt();

        for(int i = 0; i < 3; i++) {

            guarismo = numero % 10;
            numero = numero / 10;

            System.out.println(( i + 1) + " guarismo : " + guarismo);

        }

    }

}

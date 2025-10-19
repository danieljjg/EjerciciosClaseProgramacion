import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        int factorial = 1;
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero del que quieres saber el factorial: ");
        numero = sc.nextInt();

        for(int i = 1; i <= numero; i++){
            factorial *= i;
        }


        System.out.println("El factorial de : " + numero + " es : " +  factorial);

    }

}

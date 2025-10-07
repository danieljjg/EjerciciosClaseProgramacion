import java.util.Scanner;

public class Ejercicio1 {

//    Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el número introducido por teclado sea 0.

    public static void main(String[] args) {

        int numero;
        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("Introduce un número");
            numero = sc.nextInt();

            if(numero != 0) {

                if(numero %2 == 0){
                    System.out.println("El número es par");
                } else {
                    System.out.println("El número es impar");
                }

                if(numero > 0) {

                    System.out.println("El número es positivo");

                } else {

                    System.out.println("El número es negativo");

                }

                System.out.println("El cuadrado de : " + numero + " es = " + (numero * numero));
            } else {

                System.out.println("El número es 0, vamos a salir del programa");

            }

        } while (numero != 0);

    }

}
